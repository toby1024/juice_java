package cn.wufan.juice.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class ProductServiceTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findAllTest(){

    }
}
