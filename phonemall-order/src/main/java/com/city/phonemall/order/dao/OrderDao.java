package com.city.phonemall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.city.phonemall.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 订单
 *
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

    /**
     * 修改订单状态
     *
     * @param orderSn
     * @param code
     * @param payType
     */
    void updateOrderStatus(@Param("orderSn") String orderSn,
                           @Param("code") Integer code,
                           @Param("payType") Integer payType);
}
