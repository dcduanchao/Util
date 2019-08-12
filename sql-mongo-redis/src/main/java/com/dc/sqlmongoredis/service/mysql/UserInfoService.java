package com.dc.sqlmongoredis.service.mysql;

import com.dc.sqlmongoredis.entity.UserInfo;

import java.util.List;

/**
 * @author duanchao
 * @CreateDate: 2019/8/12 0012 09:35
 */
public interface UserInfoService {

    List<UserInfo> findAll();
}
