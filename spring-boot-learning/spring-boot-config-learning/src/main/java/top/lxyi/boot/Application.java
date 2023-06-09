package top.lxyi.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")//加载自定义的XML文件
public class Application{
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}