package com.dc.sqlmongoredis.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author duanchao
 * @CreateDate: 2019/8/19 0019 15:13
 */
@Component
@Data
@PropertySource(value = {"dev.properties"})
@ConfigurationProperties(prefix = "dev.dc")
public class LoaderProperties {

    private String name;

    private String  agx;

    private Integer age;
}
