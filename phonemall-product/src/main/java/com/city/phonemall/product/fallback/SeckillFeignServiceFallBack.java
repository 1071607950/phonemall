package com.city.phonemall.product.fallback;

import com.city.common.exception.BizCodeEnum;
import com.city.common.utils.R;
import com.city.phonemall.product.feign.SeckillFeignService;
import org.springframework.stereotype.Component;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-02 09:47:33
 **/

@Component
public class SeckillFeignServiceFallBack implements SeckillFeignService {
    @Override
    public R getSkuSeckilInfo(Long skuId) {
        return R.error(BizCodeEnum.TO_MANY_REQUEST.getCode(),BizCodeEnum.TO_MANY_REQUEST.getMessage());
    }
}
