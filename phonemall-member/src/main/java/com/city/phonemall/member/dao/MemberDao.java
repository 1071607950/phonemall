package com.city.phonemall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.city.phonemall.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-02 10:24:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
