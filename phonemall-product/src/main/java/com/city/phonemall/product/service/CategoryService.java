package com.city.phonemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.city.common.utils.PageUtils;
import com.city.phonemall.product.entity.CategoryEntity;
import com.city.phonemall.product.vo.Catelog2Vo;

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

    public void updateCascade(CategoryEntity category);

    List<CategoryEntity> getLevel1Categorys();

    Map<String, List<Catelog2Vo>> getCatalogJson();

    //TODO 产生堆外内存溢出OutOfDirectMemoryError:
    //1)、springboot2.0以后默认使用lettuce操作redis的客户端，它使用通信
    //2)、lettuce的bug导致netty堆外内存溢出   可设置：-Dio.netty.maxDirectMemory
    //解决方案：不能直接使用-Dio.netty.maxDirectMemory去调大堆外内存
    //1)、升级lettuce客户端。      2）、切换使用jedis
    Map<String, List<Catelog2Vo>> getCatalogJson2();
}

