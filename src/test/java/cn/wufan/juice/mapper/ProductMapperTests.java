package cn.wufan.juice.mapper;

import cn.wufan.juice.entity.Fruit;
import cn.wufan.juice.entity.Product;
import cn.wufan.juice.entity.Store;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangbin on 2017/7/26.
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class ProductMapperTests {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private StoreMapper storeMapper;

    @Test
    public void findFruitTest(){
        Store store = new Store("store", "address", "link man", "13112341234", 1);
        storeMapper.save(store);

        Fruit fruit = new Fruit("apple","this is an apple", 10.0F, Product.StatusEnum.ACTIVE.getCode(), 1.0F,1, "image url", store);
        productMapper.saveFruit(fruit);

        Fruit findFruit = productMapper.findFruit(fruit.getId());
        Assert.assertTrue(findFruit.getName().equals("apple"));
        Assert.assertTrue(findFruit.getStore().getName().equals("store"));
    }

    @Test
    public void findAllTest(){
        Store store = new Store("store", "address", "link man", "13112341234", 1);
        storeMapper.save(store);

        Fruit fruit = new Fruit("apple","this is an apple", 10.0F, Product.StatusEnum.ACTIVE.getCode(), 1.0F, 1, "image url", store);
        productMapper.saveFruit(fruit);

        fruit = new Fruit("orange","this is an orange", 10.5F, Product.StatusEnum.ACTIVE.getCode(), 1.0F, 1, "image url", store);
        productMapper.saveFruit(fruit);

        Map<String, Object> params = new HashMap<>();
        params.put("name","apple");
        List<Product> list = productMapper.findAll(params);
        Assert.assertTrue("must return one fruit",list.size() == 1);
        Product apple = list.get(0);
        Assert.assertTrue("must find fruit apple", apple.getName().equals("apple"));
    }
}
