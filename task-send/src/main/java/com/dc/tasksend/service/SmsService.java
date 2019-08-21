package com.dc.tasksend.service;

import java.io.IOException;

/**
 * @author duanchao
 * @CreateDate: 2019/8/21 0021 11:25
 */
public interface SmsService {

    void sendSms(String mobile,String content) throws IOException;
}
