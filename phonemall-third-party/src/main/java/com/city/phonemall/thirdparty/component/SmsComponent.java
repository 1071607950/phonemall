package com.city.phonemall.thirdparty.component;


import com.city.common.utils.HttpUtils;
import lombok.Data;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-24 10:41:33
 **/

@ConfigurationProperties(prefix = "spring.cloud.alicloud.sms")
@Data
@Component
public class SmsComponent {

    private String host;
    private String path;
    private String channel;
    private String templateId;
    private String appcode;

    public void sendCode(String phone, String code) {
        String method = "POST";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        //bodys.put("callbackUrl", "http://test.dev.esandcloud.com");
        bodys.put("channel", channel);
        bodys.put("mobile", phone);
        bodys.put("templateID", templateId);
        bodys.put("templateParamSet", code + ", 10");
        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
/*        String method = "GET";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("code", code);
        querys.put("phone", phone);
        querys.put("skin", skin);
        querys.put("sign", sign);
        //JDK 1.8示例代码请在这里下载：  http://code.fegine.com/Tools.zip
        try {

            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);

            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

}
