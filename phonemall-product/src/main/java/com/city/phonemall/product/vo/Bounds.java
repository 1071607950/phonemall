/** Copyright 2020 bejson.com */
package com.city.phonemall.product.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:26:33
 */

@Data
public class Bounds implements Serializable {
  private static final long serialVersionUID = 1L;
  /**
   * 购物积分
   */
  private BigDecimal buyBounds;
  /**
   * 成长积分
   */
  private BigDecimal growBounds;

}
