package com.dc.tasksend.entity;

import lombok.Data;

/**
 * @author duanchao
 * @CreateDate: 2019/8/19 0019 16:38
 */
@Data
public class MotivationalDto {

    private Integer id;

    private String subject;

    private String context;

    /**1.早，中，晚*/
    private Integer type;
    /**0.未删除1.已删除*/
    private Integer deleted;
}
