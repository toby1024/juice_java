package cn.wufan.juice.mapper;

import cn.wufan.juice.entity.Fruit;
import cn.wufan.juice.entity.Juice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by zhangbin on 2017/7/26.
 */
@Mapper
public interface ProductMapper {

    public int saveFruit(Fruit fruit);

    public Fruit findFruit(Long id);

    public List<Fruit> findAllFruit();

    public Juice findJuice(Long id);

}
