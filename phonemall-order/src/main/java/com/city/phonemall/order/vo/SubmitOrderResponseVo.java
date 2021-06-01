package com.city.phonemall.order.vo;

import com.city.phonemall.order.entity.OrderEntity;
import lombok.Data;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 **/

@Data
public class SubmitOrderResponseVo {

    private OrderEntity order;

    /**
     * 错误状态码
     **/
    private Integer code;


}
