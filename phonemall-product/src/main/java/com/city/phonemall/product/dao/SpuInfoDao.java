package com.city.phonemall.product.dao;

import com.city.phonemall.product.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息
 *
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-02 09:47:33
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {
    void updaSpuStatus(@Param("spuId") Long spuId, @Param("code") int code);
}
