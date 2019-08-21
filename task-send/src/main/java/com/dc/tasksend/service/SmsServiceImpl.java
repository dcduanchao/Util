package com.dc.tasksend.service;

import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author duanchao
 * @CreateDate: 2019/8/21 0021 11:26
 */
@Service
public class SmsServiceImpl implements SmsService {


    @Override
    public void sendSms(String mobile, String content) throws IOException {

        SmsUtil.send("18310735805","验证码：456798");

    }
}
