package com.city.phonemall.member.feign;

import com.city.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 8:37:33
 **/

@FeignClient("phonemall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons ();
}
