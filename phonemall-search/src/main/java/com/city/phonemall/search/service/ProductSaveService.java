package com.city.phonemall.search.service;


import com.city.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-07 21:36:33
 **/
public interface ProductSaveService {

    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
