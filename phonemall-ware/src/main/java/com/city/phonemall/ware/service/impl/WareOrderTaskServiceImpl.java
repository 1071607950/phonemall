package com.city.phonemall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.city.common.utils.PageUtils;
import com.city.common.utils.Query;
import com.city.phonemall.ware.dao.WareOrderTaskDao;
import com.city.phonemall.ware.entity.WareOrderTaskEntity;
import com.city.phonemall.ware.service.WareOrderTaskService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("wareOrderTaskService")
public class WareOrderTaskServiceImpl extends ServiceImpl<WareOrderTaskDao, WareOrderTaskEntity> implements WareOrderTaskService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = String.valueOf(params.get("key"));
        IPage<WareOrderTaskEntity> page = this.page(
                new Query<WareOrderTaskEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskEntity>().lambda()
                        .like(params.containsKey("key") && org.apache.commons.lang3.StringUtils.isNotBlank(key),WareOrderTaskEntity::getOrderSn,key)
        );

        return new PageUtils(page);
    }

    @Override
    public WareOrderTaskEntity getOrderTaskByOrderSn(String orderSn) {

        WareOrderTaskEntity orderTaskEntity = this.baseMapper.selectOne(
                new QueryWrapper<WareOrderTaskEntity>().eq("order_sn", orderSn));

        return orderTaskEntity;
    }

}
