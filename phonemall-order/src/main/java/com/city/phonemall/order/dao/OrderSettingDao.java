package com.city.phonemall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.city.phonemall.order.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-31 8:37:33
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {

}
