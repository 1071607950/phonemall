package com.city.common.to;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 购物积分、成长积分信息
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:41:33
 **/

@Data
public class SpuBoundTo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    private Long spuId;
    /**
     * 购物积分
     */
    private BigDecimal buyBounds;
    /**
     * 成长积分
     */
    private BigDecimal growBounds;

}
