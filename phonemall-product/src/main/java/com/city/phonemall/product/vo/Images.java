/** Copyright 2020 bejson.com */
package com.city.phonemall.product.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:26:33
 */

@Data
public class Images implements Serializable {
  private static final long serialVersionUID = 1L;

  private String imgUrl;
  private int defaultImg;

}
