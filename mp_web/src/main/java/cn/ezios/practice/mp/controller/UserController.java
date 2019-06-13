package cn.ezios.practice.mp.controller;

import cn.ezios.practice.mp.entities.ShopModel;
import cn.ezios.practice.mp.entities.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Date 2019/6/13 21:22
 * @Creaded By Wangj
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping({"/",""})
    public UserModel get(UserModel userModel){
        userModel.setId("01");
        userModel.setName("wangwenwen");
        userModel.setPassword("2134");
        return userModel;
    }

    @GetMapping("/{shop}")
    public ShopModel get(ShopModel shopModel){
        shopModel.setAddress("101");
        shopModel.setName("www");
        return shopModel;
    }

}
