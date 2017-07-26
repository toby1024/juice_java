package cn.wufan.juice.mapper;

import cn.wufan.juice.entity.Store;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by zhangbin on 2017/7/26.
 */
@Mapper
public interface StoreMapper {

    public int save(Store store);
    public Store find(Long id);

}
