package cn.ezios.practice.mp.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName ShopModel
 * @Description TODO
 * @Date 2019/6/13 22:03
 * @Creaded By Wangj
 */
@Data
@TableName(value = "shop_case")
public class ShopModel {
    private int id;
    private String name;
    private String address;
}
