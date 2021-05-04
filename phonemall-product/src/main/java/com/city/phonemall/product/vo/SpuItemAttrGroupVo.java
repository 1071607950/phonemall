package com.city.phonemall.product.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:26:33
 */
@Data
@ToString
public class SpuItemAttrGroupVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String groupName;

    private List<Attr> attrs;

}
