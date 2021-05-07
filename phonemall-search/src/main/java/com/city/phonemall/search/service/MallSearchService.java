package com.city.phonemall.search.service;


import com.city.phonemall.search.vo.SearchParam;
import com.city.phonemall.search.vo.SearchResult;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-07 21:36:33
 */
public interface MallSearchService {

    /**
     * 搜索
     *
     * @param param 检索的所有参数
     * @return 返回检索的结果，里面包含页面需要的所有信息
     */
    SearchResult search(SearchParam param);
}
