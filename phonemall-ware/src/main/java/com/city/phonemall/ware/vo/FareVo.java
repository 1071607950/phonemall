package com.city.phonemall.ware.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 9:46:28
 **/

@Data
public class FareVo {

    private MemberAddressVo address;

    private BigDecimal fare;

}


