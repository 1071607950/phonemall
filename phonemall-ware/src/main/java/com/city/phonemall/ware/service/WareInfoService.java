package com.city.phonemall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.city.common.utils.PageUtils;
import com.city.phonemall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-02 10:46:28
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

