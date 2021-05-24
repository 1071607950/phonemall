package com.city.phonemall.ware.feign;

import com.city.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 10:46:28
 **/

@FeignClient(value = "phonemall-product")
public interface ProductFeignService {

    /**
     * /product/skuinfo/info/{skuId}
     * <p>
     * <p>
     * 1)、让所有请求过网关；
     * 1、@FeignClient("phonemall-gateway")：给phonemall-gateway所在的机器发请求
     * 2、/api/product/skuinfo/info/{skuId}
     * 2）、直接让后台指定服务处理
     * 1、@FeignClient("phonemall-product")
     * 2、/product/skuinfo/info/{skuId}
     *
     * @return
     */
    @RequestMapping("/product/skuinfo/info/{skuId}")
    public R info(@PathVariable("skuId") Long skuId);

}
