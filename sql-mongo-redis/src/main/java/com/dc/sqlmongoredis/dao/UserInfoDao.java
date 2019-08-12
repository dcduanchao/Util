package com.dc.sqlmongoredis.dao;

import com.dc.sqlmongoredis.entity.UserInfo;

import java.util.List;

/**
 * @author duanchao
 * @CreateDate: 2019/8/12 0012 09:36
 */
public interface UserInfoDao {
    /**查询所有*/
    List<UserInfo> findAll();
}
