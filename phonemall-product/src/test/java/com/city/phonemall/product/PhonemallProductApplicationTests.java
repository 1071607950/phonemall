package com.city.phonemall.product;

import com.city.phonemall.product.dao.AttrGroupDao;
import com.city.phonemall.product.dao.SkuSaleAttrValueDao;
import com.city.phonemall.product.service.BrandService;
import com.city.phonemall.product.service.CategoryService;
import com.city.phonemall.product.vo.SkuItemSaleAttrVo;
import com.city.phonemall.product.vo.SpuItemAttrGroupVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class PhonemallProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Resource
    private CategoryService categoryService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    @Resource
    private AttrGroupDao attrGroupDao;

    @Resource
    private SkuSaleAttrValueDao skuSaleAttrValueDao;

    @org.junit.Test
    public void test1() {
        List<SkuItemSaleAttrVo> saleAttrBySpuId = skuSaleAttrValueDao.getSaleAttrBySpuId(13L);
        saleAttrBySpuId.forEach(System.out::println);
    }

    @org.junit.Test
    public void test() {
        List<SpuItemAttrGroupVo> attrGroupWithAttrsBySpuId = attrGroupDao.getAttrGroupWithAttrsBySpuId(130L, 225L);
        attrGroupWithAttrsBySpuId.forEach(System.out::println);
    }

    @org.junit.Test
    public void testRedisson() {
        System.out.println(redissonClient);
    }

    @org.junit.Test
    public void testStringRedis() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();

        //保存
        ops.set("hello", "world_" + UUID.randomUUID().toString());

        //查询
        String hello = ops.get("hello");
        System.out.println("之前保存的数据:" + hello);
    }

    @org.junit.Test
    public void testFindPath() {
        Long[] catelogPath = categoryService.findCatelogPath(225l);

        log.info("完整路径catelogPath={}", Arrays.asList(catelogPath));
    }


    @Test
    public void contextLoads() {
        System.out.println(Integer.MAX_VALUE);

    }

}

