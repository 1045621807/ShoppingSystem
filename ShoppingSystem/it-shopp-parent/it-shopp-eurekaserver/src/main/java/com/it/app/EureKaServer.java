package com.it.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * springcloud服务注册中心
 * @author zhoujianfeng
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class EureKaServer {
	public static void main(String[] args) {
		SpringApplication.run(EureKaServer.class, args);
	}
}
