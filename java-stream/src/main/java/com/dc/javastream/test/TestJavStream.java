package com.dc.javastream.test;

import com.dc.javastream.entity.UserInfo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author duanchao
 * @CreateDate: 2019/8/8 0008 11:28
 */
public class TestJavStream {

    static  List<UserInfo> userInfos = new ArrayList<>();

    static {
        for (int i=1;i<=10;i++){
            UserInfo info = new UserInfo();
            info.setUserId(i+"");
            info.setUserName("test"+i);
            Random random = new Random();
            int age = random.nextInt()*5+1;
            info.setAge(age);
            userInfos.add(info);
        }

    }

    public static void main(String[] args) {
        
        //list<object>-->list<字段>
        List<String> userList = userInfos.stream().map(UserInfo::getUserId).collect(Collectors.toList());
        //排序
        List<UserInfo> collect = userInfos.stream().sorted(Comparator.comparing(UserInfo::getAge).reversed()).collect(Collectors.toList());


        //NPE 异常解决
        Map<String, List<String>> map = userInfos.stream().collect(Collectors.toMap(UserInfo::getUserId,
                p ->  {
                    List<String> getNameList = new ArrayList<>();
                    getNameList.add(p.getUserName());
                    return getNameList;
                },
                (List<String> value1, List<String> value2) -> {
                    value1.addAll(value2);
                    return value1;
                }
        ));
        System.out.println(map);

    }




}
