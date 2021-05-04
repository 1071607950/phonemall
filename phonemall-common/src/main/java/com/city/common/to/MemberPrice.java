/** Copyright 2020 bejson.com */
package com.city.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 会员价格
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:41:33
 */

@Data
public class MemberPrice {
  /**
   * 会员等级ID
   */
  private Long id;
  /**
   * 等级等级名
   */
  private String name;
  /**
   * 会员对应价格
   */
  private BigDecimal price;

}
