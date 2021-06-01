package com.city.phonemall.order.vo;

import lombok.Data;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 */

@Data
public class PayVo {

    private String out_trade_no; // 商户订单号 必填
    private String subject; // 订单名称 必填
    private String total_amount;  // 付款金额 必填
    private String body; // 商品描述 可空
}
