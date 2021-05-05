package com.city.phonemall.ware.feign;

import com.city.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 10:46:28
 **/

@FeignClient("phonemall-order")
public interface OrderFeignService {

    @GetMapping(value = "/order/order/status/{orderSn}")
    R getOrderStatus(@PathVariable("orderSn") String orderSn);

}
