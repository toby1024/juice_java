package cn.wufan.juice.service;

import cn.wufan.juice.entity.Product;
import cn.wufan.juice.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangbin on 2017/7/26.
 */
@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public List<Product> findAll(String name, Integer category) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        params.put("category", category);
        return productMapper.findAll(params);
    }
}
