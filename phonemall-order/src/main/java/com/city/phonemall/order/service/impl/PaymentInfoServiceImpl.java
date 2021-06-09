package com.city.phonemall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.city.common.utils.PageUtils;
import com.city.common.utils.Query;
import com.city.phonemall.order.dao.PaymentInfoDao;
import com.city.phonemall.order.entity.PaymentInfoEntity;
import com.city.phonemall.order.service.PaymentInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("paymentInfoService")
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoDao, PaymentInfoEntity> implements PaymentInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = String.valueOf(params.get("key"));
        IPage<PaymentInfoEntity> page = this.page(
                new Query<PaymentInfoEntity>().getPage(params),
                new QueryWrapper<PaymentInfoEntity>().lambda()
                        .like(params.containsKey("key") && org.apache.commons.lang3.StringUtils.isNotBlank(key),PaymentInfoEntity::getOrderSn,key)

        );

        return new PageUtils(page);
    }

}
