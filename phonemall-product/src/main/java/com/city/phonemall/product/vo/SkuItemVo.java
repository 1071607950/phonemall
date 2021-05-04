package com.city.phonemall.product.vo;

import com.city.phonemall.product.entity.SkuImagesEntity;
import com.city.phonemall.product.entity.SkuInfoEntity;
import com.city.phonemall.product.entity.SpuInfoDescEntity;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:26:33
 */


@ToString
@Data
public class SkuItemVo implements Serializable {
    private static final long serialVersionUID = 1L;

    //1、sku基本信息的获取  pms_sku_info
    private SkuInfoEntity info;

    private boolean hasStock = true;

    //2、sku的图片信息    pms_sku_images
    private List<SkuImagesEntity> images;

    //3、获取spu的销售属性组合
    private List<SkuItemSaleAttrVo> saleAttr;

    //4、获取spu的介绍
    private SpuInfoDescEntity desc;

    //5、获取spu的规格参数信息
    private List<SpuItemAttrGroupVo> groupAttrs;

    //6、秒杀商品的优惠信息
    private SeckillSkuVo seckillSkuVo;

}
