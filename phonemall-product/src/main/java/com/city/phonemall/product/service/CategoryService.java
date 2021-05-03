package com.city.phonemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.city.common.utils.PageUtils;
import com.city.phonemall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-02 09:47:33
 */
public interface CategoryService extends IService<CategoryEntity> {

    /**
     * 分页查询
     * @author liuZhongKun
     * @date 2021/5/3 12:07
     * @param params 分页信息
     * @return com.city.common.utils.PageUtils
     **/

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 三级分类
     * @author liuZhongKun
     * @date 2021/5/3 12:07
     * @param
     * @return java.util.List<com.city.phonemall.product.entity.CategoryEntity>
     **/
    List<CategoryEntity> listWithTree();

    /**
     * 删除菜单
     * @author liuZhongKun
     * @date 2021/5/3 12:08
     * @param asList 要删除菜单的ID
     * @return void
     **/
    void removeMenuByIds(List<Long> asList);

    /**
     * 找到catelogId的完整路径
     * [父/子/孙]
     * @param catelogId
     * @return
     */
    Long[] findCatelogPath(Long catelogId);


}

