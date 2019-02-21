package cn.om.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
//import org.springframework.cloud.config.environment.Environment;
//import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
/**
 * Created by jianhao on 2019/2/21.
 * 文件说明:无
 */
@SpringBootApplication
@EnableConfigServer
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
