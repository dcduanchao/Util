package com.dc.sqlmongoredis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author duanchao
 * @CreateDate: 2019/8/12 0012 09:32
 */
@Data
public class UserInfo implements Serializable {


    private Integer id;

    private String name;

    private String pwd;

    private Date createTime;
}
