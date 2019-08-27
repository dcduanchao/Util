package com.dc.sqlmongoredis;

import com.dc.sqlmongoredis.entity.UserInfo;
import com.dc.sqlmongoredis.service.mysql.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqlMongoRedisApplicationTests {

    @Autowired
    UserInfoService userInfoService;

    @Test
    public void contextLoads() {
//        UserInfo byId = userInfoService.findById(183);
//        System.out.println(byId.getId()==183);

        List<UserInfo> all = userInfoService.findAll();
        System.out.println(all);

    }

    @Test
    public  void list(){
       int a = 183;
        System.out.println(183==a);
        UserInfo u = new UserInfo();




    }

}
