package com.city.phonemall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author liuZhongKun
 * @Description: 封装订单提交数据的vo
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 **/

@Data
public class OrderSubmitVo {

    /**
     * 收获地址的id
     **/
    private Long addrId;

    /**
     * 支付方式
     **/
    private Integer payType;
    //无需提交要购买的商品，去购物车再获取一遍
    //优惠、发票

    /**
     * 防重令牌
     **/
    private String orderToken;

    /**
     * 应付价格
     **/
    private BigDecimal payPrice;

    /**
     * 订单备注
     **/
    private String remarks;

    //用户相关的信息，直接去session中取出即可
}
