package com.dc.sqlmongoredis.service.mysql;

import com.dc.sqlmongoredis.dao.UserInfoDao;
import com.dc.sqlmongoredis.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author duanchao
 * @CreateDate: 2019/8/12 0012 09:35
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;


    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }
}
