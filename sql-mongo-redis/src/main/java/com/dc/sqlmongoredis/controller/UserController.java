package com.dc.sqlmongoredis.controller;

import com.dc.sqlmongoredis.entity.UserInfo;
import com.dc.sqlmongoredis.service.mysql.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("all")
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }
}
