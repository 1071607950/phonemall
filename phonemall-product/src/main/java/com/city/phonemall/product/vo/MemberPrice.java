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
public class MemberPrice implements Serializable {
  private static final long serialVersionUID = 1L;

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
