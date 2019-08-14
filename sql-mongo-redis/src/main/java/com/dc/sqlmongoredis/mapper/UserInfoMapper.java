package com.dc.sqlmongoredis.mapper;

import com.dc.sqlmongoredis.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author duanchao
 * @CreateDate: 2019/8/12 0012 09:38
 */
@Mapper
@Component
public interface UserInfoMapper {

    @Select("select * from user_info")
    List<UserInfo> findAll();

    @Select( "select * from user_info where id = #{id}")
    UserInfo findById(@Param("id") Integer id);
}
