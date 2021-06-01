package com.city.phonemall.order.to;

import com.city.phonemall.order.entity.OrderEntity;
import com.city.phonemall.order.entity.OrderItemEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 **/

@Data
public class OrderCreateTo {

    private OrderEntity order;

    private List<OrderItemEntity> orderItems;

    /**
     * 订单计算的应付价格
     **/
    private BigDecimal payPrice;

    /**
     * 运费
     **/
    private BigDecimal fare;

}
