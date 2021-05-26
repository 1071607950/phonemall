package com.city.common.to;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 保存满减打折、会员价格列表
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:41:33
 **/

@Data
public class SkuReductionTo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long skuId;
    /**
     * 满几件
     */
    private int fullCount;
    /**
     * 打几折
     */
    private BigDecimal discount;
    /**
     * 打折是否叠加其他优惠
     */
    private int countStatus;
    /**
     * 满多少
     */
    private BigDecimal fullPrice;
    /**
     * 减多少
     */
    private BigDecimal reducePrice;
    /**
     * 满减可叠加其他优惠
     */
    private int priceStatus;
    /**
     * 会员价格列表
     */
    private List<MemberPrice> memberPrice;

}
