package com.city.phonemall.search.service.impl;

import com.alibaba.fastjson.JSON;
import com.city.common.to.es.SkuEsModel;
import com.city.phonemall.search.config.MallElasticSearchConfig;
import com.city.phonemall.search.constant.EsConstant;
import com.city.phonemall.search.service.ProductSaveService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-07 21:36:33
 */
@Slf4j
@Service("productSaveService")
public class ProductSaveServiceImpl implements ProductSaveService {

    @Autowired
    private RestHighLevelClient esRestClient;

    @Override
    public boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException {

//1.在es中建立索引，建立号映射关系（doc/json/product-mapping.json）

        //2. 在ES中保存这些数据
        BulkRequest bulkRequest = new BulkRequest();
        for (SkuEsModel skuEsModel : skuEsModels) {
            //构造保存请求
            IndexRequest indexRequest = new IndexRequest(EsConstant.PRODUCT_INDEX);
            indexRequest.id(skuEsModel.getSkuId().toString());
            String jsonString = JSON.toJSONString(skuEsModel);
            indexRequest.source(jsonString, XContentType.JSON);
            bulkRequest.add(indexRequest);
        }

        BulkResponse bulk = esRestClient.bulk(bulkRequest, MallElasticSearchConfig.COMMON_OPTIONS);

        //TODO 如果批量错误
        boolean hasFailures = bulk.hasFailures();

        List<String> collect = Arrays.asList(bulk.getItems()).stream().map(item -> {
            return item.getId();
        }).collect(Collectors.toList());

        log.info("商品上架完成：{}",collect);

        return hasFailures;
    }

    @Override
    public boolean productStatusDown(List<Long> skuIdList) throws IOException {

        BulkRequest bulkRequest = new BulkRequest();
        for (Long skuId : skuIdList) {
            //构造保存请求
            DeleteRequest deleteRequest = new DeleteRequest(EsConstant.PRODUCT_INDEX);
            deleteRequest.id(skuId.toString());
            bulkRequest.add(deleteRequest);
        }

        BulkResponse bulk = esRestClient.bulk(bulkRequest, MallElasticSearchConfig.COMMON_OPTIONS);

        //TODO 如果批量错误
        boolean hasFailures = bulk.hasFailures();

        List<String> collect = Arrays.asList(bulk.getItems()).stream().map(item -> {
            return item.getId();
        }).collect(Collectors.toList());

        log.info("商品下架完成：{}",collect);

        return hasFailures;
    }
}
