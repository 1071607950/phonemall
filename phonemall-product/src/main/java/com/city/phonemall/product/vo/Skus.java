/** Copyright 2020 bejson.com */
package com.city.phonemall.product.vo;

import com.city.common.to.MemberPrice;
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
public class Skus implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<Attr> attr;
  /**
   * 商品名称
   */
  private String skuName;
  /**
   * 价格
   */
  private BigDecimal price;
  /**
   * 标题
   */
  private String skuTitle;
  /**
   * 副标题
   */
  private String skuSubtitle;
  /**
   * 图片列表
   */
  private List<Images> images;
  private List<String> descar;
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
