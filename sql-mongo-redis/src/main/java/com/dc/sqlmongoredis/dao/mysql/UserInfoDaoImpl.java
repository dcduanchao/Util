package com.dc.sqlmongoredis.dao.mysql;

import com.dc.sqlmongoredis.dao.UserInfoDao;
import com.dc.sqlmongoredis.entity.UserInfo;
import com.dc.sqlmongoredis.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author duanchao
 * @CreateDate: 2019/8/12 0012 09:37
 */
@Repository
public class UserInfoDaoImpl implements UserInfoDao {


    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.findAll();
    }

    @Override
    public UserInfo findById(int id) {
        return userInfoMapper.findById(id);
    }
}
