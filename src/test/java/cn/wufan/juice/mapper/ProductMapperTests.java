package cn.wufan.juice.mapper;

import cn.wufan.juice.entity.Fruit;
import cn.wufan.juice.entity.Store;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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

        Fruit fruit = new Fruit("apple","this is an apple", 10.0F, 1, 1.0F, "image url", store);
        productMapper.saveFruit(fruit);

        Fruit findFruit = productMapper.findFruit(fruit.getId());
        Assert.assertTrue(findFruit.getName().equals("apple"));
        Assert.assertTrue(findFruit.getStore().getName().equals("store"));
    }
}
