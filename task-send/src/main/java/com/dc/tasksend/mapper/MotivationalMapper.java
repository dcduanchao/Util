package com.dc.tasksend.mapper;

import com.dc.tasksend.entity.MotivationalDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author duanchao
 * @CreateDate: 2019/8/19 0019 17:22
 */
@Component
@Mapper
public interface MotivationalMapper {

    @Select("select * from motivational_dto where type = #{type} and deleted=0 ")
    List<MotivationalDto> findByType(@Param("type") Integer type);
}
