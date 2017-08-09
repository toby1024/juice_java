package cn.wufan.juice.service;

import cn.wufan.juice.entity.Product;
import cn.wufan.juice.mapper.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class ProductServiceTests {
    @Configuration
    static class ProductServiceTestContextConfiguration {
        @Bean
        public ProductService productService() {
            return new ProductService();
        }
        @Bean
        public ProductMapper productMapper() {
            return Mockito.mock(ProductMapper.class);
        }
    }

    @Autowired
    private ProductService productService;

    @Test
    public void findAllTest(){
        List<Product> hots = productService.hots();
        Assert.isTrue(hots.size() == 0, "no hots");
    }
}
