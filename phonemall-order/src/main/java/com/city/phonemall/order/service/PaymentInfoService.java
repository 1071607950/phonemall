package com.city.phonemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.city.common.utils.PageUtils;
import com.city.phonemall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

