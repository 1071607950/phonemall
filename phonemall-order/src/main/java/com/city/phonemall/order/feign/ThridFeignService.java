package com.city.phonemall.order.feign;

import com.alipay.api.AlipayApiException;
import com.city.phonemall.order.vo.PayVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 **/

@FeignClient("phonemall-third-party")
public interface ThridFeignService {

    @GetMapping(value = "/pay", consumes = "application/json")
    String pay(@RequestBody PayVo vo) throws AlipayApiException;

}
