package cc.tianbin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by nibnait on 2022/11/20
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer03Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer03Application.class, args);
    }

}
