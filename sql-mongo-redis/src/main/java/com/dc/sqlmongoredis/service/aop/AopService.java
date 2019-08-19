package com.dc.sqlmongoredis.service.aop;

import com.dc.sqlmongoredis.entity.UserInfo;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author duanchao
 * @CreateDate: 2019/8/16 0016 11:28
 */
@Component
@Aspect
public class AopService {

    @Pointcut(value = "execution(* com.dc.sqlmongoredis.controller.*.*(..))&& args(userInfo)")
    public  void pointCut(UserInfo  userInfo){
    }

    @After(value = "pointCut(userInfo)")
    public void doBefore(UserInfo  userInfo){
        System.out.println("进入 doBefore....");
    }


    @Pointcut(value = "execution(* com.dc.sqlmongoredis.controller.*.*(..))&& args(intType)")
    public  void pointCutInt(Integer  intType){
    }

    @After(value = "pointCutInt(intType)")
    public void doBeforeInt(Integer  intType){
        System.out.println("进入 doBeforeInt....");
    }
}
