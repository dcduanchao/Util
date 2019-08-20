package com.dc.tasksend.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author duanchao
 * @CreateDate: 2019/8/19 0019 15:53
 */
@Component
@ConfigurationProperties(prefix = "spring.mail")
@Data
public class EmailCommon {

    private  String host;
    private  String username;
    private  String password;
    private  String to;

}
