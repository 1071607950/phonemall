package com.city.phonemall.auth.feign;


import com.city.common.utils.R;
import com.city.phonemall.auth.vo.SocialUser;
import com.city.phonemall.auth.vo.UserLoginVo;
import com.city.phonemall.auth.vo.UserRegisterVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-24 09:47:33
 **/

@FeignClient("phonemall-member")
public interface MemberFeignService {

    @PostMapping(value = "/member/member/register")
    R register(@RequestBody UserRegisterVo vo);


    @PostMapping(value = "/member/member/login")
    R login(@RequestBody UserLoginVo vo);

    @PostMapping(value = "/member/member/oauth2/login")
    R oauthLogin(@RequestBody SocialUser socialUser) throws Exception;

    @PostMapping(value = "/member/member/weixin/login")
    R weixinLogin(@RequestParam("accessTokenInfo") String accessTokenInfo);
}
