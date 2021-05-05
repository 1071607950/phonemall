package com.city.phonemall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 9:46:28
 **/

@Data
public class MergeVo {

    private Long purchaseId;

    private List<Long> items;

}
