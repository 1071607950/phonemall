package com.city.phonemall.ware.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 9:46:28
 **/

@Data
public class MergeVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long purchaseId;

    private List<Long> items;

}
