package com.city.phonemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.city.common.to.SkuReductionTo;
import com.city.common.utils.PageUtils;
import com.city.phonemall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-02 10:17:10
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

