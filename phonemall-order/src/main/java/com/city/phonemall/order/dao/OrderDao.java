package com.city.phonemall.order.dao;

import com.city.phonemall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-02 10:36:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
