package com.dc.tasksend.service;

import com.alibaba.fastjson.JSON;
import com.dc.tasksend.entity.MotivationalDto;
import com.dc.tasksend.mapper.MotivationalMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author duanchao
 * @CreateDate: 2019/8/19 0019 17:22
 */
@Service
public class MotivationalServiceImpl implements  MotivationalService {

    Logger logger = LoggerFactory.getLogger(MotivationalServiceImpl.class);

    @Autowired
    private MotivationalMapper motivationalMapper;

    @Override
    public List<MotivationalDto> findByType(Integer type) {
        List<MotivationalDto> byType = motivationalMapper.findByType(type);

        logger.info("MotivationalServiceImpl 类型type={}，value={}",type, JSON.toJSONString(byType));
        return byType;
    }
}
