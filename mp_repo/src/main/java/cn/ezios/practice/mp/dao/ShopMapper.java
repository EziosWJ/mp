package cn.ezios.practice.mp.dao;

import cn.ezios.practice.mp.entities.ShopModel;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopMapper extends BaseMapper<ShopModel> {
}
