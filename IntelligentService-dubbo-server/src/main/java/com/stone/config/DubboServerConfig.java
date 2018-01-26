package com.stone.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author stone
 * @date 2018/1/22 10:21
 */
@Configuration
@PropertySource("classpath:dubbo/dubbo-server.properties")
@ImportResource({ "classpath:dubbo/*.xml" })
public class DubboServerConfig {
}
