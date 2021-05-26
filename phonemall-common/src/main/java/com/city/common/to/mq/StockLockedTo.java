package com.city.common.to.mq;

import lombok.Data;

import java.io.Serializable;

/**
 * 发送到mq消息队列的to
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:41:33
 **/

@Data
public class StockLockedTo implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 库存工作单的id **/
    private Long id;

    /** 工作单详情的所有信息 **/
    private StockDetailTo detailTo;
}
