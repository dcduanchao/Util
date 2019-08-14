package com.dc.sqlmongoredis.service.mysql;

import com.dc.sqlmongoredis.dao.UserInfoDao;
import com.dc.sqlmongoredis.entity.UserInfo;
import com.dc.sqlmongoredis.util.RedisUtil;
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
    @Autowired
    private RedisUtil redisUtil;
//    @Autowired
//    RedisUtil2 redisUtil2;


    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }

    @Override
    public UserInfo findById(Integer id) {
        UserInfo byId = userInfoDao.findById(id);
        if(null!=byId){
            redisUtil.set(byId.getName(),byId);
            UserInfo u = (UserInfo) redisUtil.get(byId.getName());
            System.out.println(u);

            return u;

        }
        return null;
    }

  
}
