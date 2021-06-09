package com.city.phonemall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.city.common.utils.PageUtils;
import com.city.common.utils.Query;
import com.city.phonemall.member.dao.MemberLevelDao;
import com.city.phonemall.member.entity.MemberLevelEntity;
import com.city.phonemall.member.service.MemberLevelService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("memberLevelService")
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelDao, MemberLevelEntity> implements MemberLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = String.valueOf(params.get("key"));
        IPage<MemberLevelEntity> page = this.page(
                new Query<MemberLevelEntity>().getPage(params),
                new QueryWrapper<MemberLevelEntity>().lambda()
                        .like(params.containsKey("key") && org.apache.commons.lang3.StringUtils.isNotBlank(key),MemberLevelEntity::getName,key)
        );

        return new PageUtils(page);
    }

}
