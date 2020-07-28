package com.happy.home.zk.service.controller;

import com.happy.home.zk.service.vo.UserVO;
import org.springframework.web.bind.annotation.*;

/**
 * @author: lijixiao
 * @date: 2020-07-28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public UserVO get(){
        return new UserVO()
                .setId(1)
                .setName("小宝")
                .setAge(1);
    }

    @DeleteMapping
    public boolean delete(){
        return true;
    }

    @PostMapping
    public UserVO save(){
        return new UserVO()
                .setId(1)
                .setName("小宝")
                .setAge(1);
    }
}
