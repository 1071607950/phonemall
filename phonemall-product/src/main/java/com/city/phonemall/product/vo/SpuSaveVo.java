/** Copyright 2020 bejson.com */
package com.city.phonemall.product.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:26:33
 */

@Data
public class SpuSaveVo implements Serializable {
  private static final long serialVersionUID = 1L;

  private String spuName;
  private String spuDescription;
  private Long catalogId;
  private Long brandId;
  private BigDecimal weight;
  private int publishStatus;
  private List<String> decript;
  private List<String> images;
  private Bounds bounds;
  private List<BaseAttrs> baseAttrs;
  private List<Skus> skus;


}
