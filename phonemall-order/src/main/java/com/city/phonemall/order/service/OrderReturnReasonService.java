package com.city.phonemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.city.common.utils.PageUtils;
import com.city.phonemall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

