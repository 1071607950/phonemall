package com.city.phonemall.ware.vo;

import lombok.Data;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 9:46:28
 **/

@Data
public class LockStockResultVo {

    private Long skuId;

    private Integer num;

    /** 是否锁定成功 **/
    private Boolean locked;

}
