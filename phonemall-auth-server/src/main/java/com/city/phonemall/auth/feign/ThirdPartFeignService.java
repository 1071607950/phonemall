package com.city.phonemall.auth.feign;


import com.city.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-24 09:47:33
 **/

@FeignClient("phonemall-third-party")
public interface ThirdPartFeignService {

    @GetMapping(value = "/sms/sendCode")
    R sendCode(@RequestParam("phone") String phone, @RequestParam("code") String code);

}
