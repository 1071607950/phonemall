package com.city.phonemall.order.vo;

import lombok.Data;

import java.util.List;

/**
 * @author liuZhongKun
 * @Description: 锁定库存的vo
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 **/

@Data
public class WareSkuLockVo {

    private String orderSn;

    /**
     * 需要锁住的所有库存信息
     **/
    private List<OrderItemVo> locks;


}
