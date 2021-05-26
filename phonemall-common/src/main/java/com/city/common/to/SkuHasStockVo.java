package com.city.common.to;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:41:33
 **/

@Data
public class SkuHasStockVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long skuId;

    private Boolean hasStock;

}
