package com.dc.tasksend;

import com.dc.tasksend.entity.MotivationalDto;
import com.dc.tasksend.service.MotivationalService;
import com.dc.tasksend.service.SmsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskSendApplicationTests {

    @Autowired
    SmsService smsService;
    @Autowired
    MotivationalService motivationalService;

    @Test
    public void contextLoads() throws IOException {
        smsService.sendSms("18310735805","验证码：123456");
    }
    
    @Test
    public  void  log(){
        motivationalService.findByType(1);

    }

}
