package cn.wufan.juice.mapper;

import cn.wufan.juice.entity.Fruit;
import cn.wufan.juice.entity.Juice;
import cn.wufan.juice.entity.Product;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by zhangbin on 2017/7/26.
 */
@Mapper
public interface ProductMapper {

    public int saveFruit(Fruit fruit);

    public Fruit findFruit(Long id);

    public List<Fruit> findAllFruit();

    public Juice findJuice(Long id);

    List<Product> findAll(Map<String, Object> params);

    List<Product> hots();
}
