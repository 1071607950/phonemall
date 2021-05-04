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

  /**
   * 商品名称
   */
  private String spuName;
  /**
   * 商品描述
   */
  private String spuDescription;
  /**
   * 分类ID
   */
  private Long catalogId;
  /**
   * 品牌ID
   */
  private Long brandId;
  /**
   * 商品重量(Kg)
   */
  private BigDecimal weight;
  /**
   * 上架状态[0 - 下架，1 - 上架]
   */
  private int publishStatus;
  /**
   * 商品介绍
   */
  private List<String> decript;
  /**
   * 商品图集，最后sku也可以新增
   */
  private List<String> images;
  /**
   * 积分
   */
  private Bounds bounds;
  /**
   * 基本属性
   */
  private List<BaseAttrs> baseAttrs;
  /**
   * 所有sku信息
   */
  private List<Skus> skus;


}
