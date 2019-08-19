package com.dc.sqlmongoredis.controller;

import com.dc.sqlmongoredis.config.LoaderProperties;
import com.dc.sqlmongoredis.entity.UserInfo;
import com.dc.sqlmongoredis.service.mysql.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author duanchao
 * @CreateDate: 2019/8/12 0012 09:49
 */
@RestController
@RequestMapping("")
public class UserController {

    @Autowired
    UserInfoService userInfoService;
    @Autowired
    LoaderProperties properties;

    @RequestMapping("all")
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }

    @GetMapping("/user")
    public UserInfo findby(UserInfo userInfo){
        return  userInfoService.findby(userInfo);
    }
    @GetMapping("/userId")
    public UserInfo find(Integer id){
        return userInfoService.findById(id);
    }

    @GetMapping("/load")
    public  String load(){
        String s =   properties.getName()+properties.getAgx()+properties.getAge();
        return s;
    }
}
