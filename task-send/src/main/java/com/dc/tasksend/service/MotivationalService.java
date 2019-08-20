package com.dc.tasksend.service;

import com.dc.tasksend.entity.MotivationalDto;

import java.util.List;

/**
 * @author duanchao
 * @CreateDate: 2019/8/19 0019 17:21
 */
public interface MotivationalService {

    List<MotivationalDto> findByType(Integer type);
}
