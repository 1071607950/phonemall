package com.city.phonemall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 **/

@Data
public class FareVo {

    private MemberAddressVo address;

    private BigDecimal fare;

}
