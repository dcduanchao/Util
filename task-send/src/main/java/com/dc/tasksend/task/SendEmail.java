package com.dc.tasksend.task;

import com.dc.tasksend.common.EmailCommon;
import com.dc.tasksend.entity.MotivationalDto;
import com.dc.tasksend.service.MotivationalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author duanchao
 * @CreateDate: 2019/8/19 0019 15:40
 */
@Component
public class SendEmail {
    @Autowired
    private EmailCommon emailCommon;
    @Autowired
    private MotivationalService motivationalService;
    @Autowired
    MailService mailService;

//    @Scheduled(cron ="0 0/1 * * * ? ")
//    public void task(){
//        getData(1);
//        System.out.println("发送");
//    }


    @Scheduled(cron ="0 0 10 * * ? ")
    public void taskSend1(){

        getData(1);

    }

    @Scheduled(cron ="0 0 14 * * ? ")
    public void taskSend2(){
        getData(2);
    }


    @Scheduled(cron ="0 0 18 * * ? ")
    public void taskSend3(){
        getData(3);

    }

      public void getData(Integer type){
          List<MotivationalDto> byType = motivationalService.findByType(1);
          if(CollectionUtils.isEmpty(byType)){
              return ;
          }
          Random random = new Random();
          int r = random.nextInt(byType.size());
          MotivationalDto motivationalDto = byType.get(r);
          //"1204089984@qq.com"
          String[] to = {"duanchao0320@163.com","1204089984@qq.com"};
          mailService.sendHtmlMail(to,motivationalDto.getSubject(),motivationalDto.getContext());
      }

}
