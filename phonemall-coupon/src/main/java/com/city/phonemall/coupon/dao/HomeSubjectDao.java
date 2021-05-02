package com.city.phonemall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.city.phonemall.coupon.entity.HomeSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-02 10:17:10
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {

}
