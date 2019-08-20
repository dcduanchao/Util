package com.dc.tasksend.controller;

import com.dc.tasksend.common.EmailCommon;
import com.dc.tasksend.entity.MotivationalDto;
import com.dc.tasksend.service.MotivationalService;
import com.dc.tasksend.task.MailService;
import com.dc.tasksend.task.SendEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * @author duanchao
 * @CreateDate: 2019/8/19 0019 16:22
 */
@RestController
@RequestMapping("")
public class TestController {



    @Autowired
    private EmailCommon emailCommon;
    @Autowired
    MailService mailService;
    @Autowired
    MotivationalService motivationalService;
    @Autowired
    SendEmail sendEmail;

    @GetMapping("/send")
    public  String sendEmail(){
        String to = emailCommon.getTo();
        mailService.sendSimpleMail(to,"学一点，每天有个好心情","好好学习");
        return "发送成功";
    }

    @GetMapping("/sendht")
    public  String sendEmailHt(){
        sendEmail.getData(1);
        return "发送成功";
    }
}
