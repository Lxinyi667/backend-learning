package top.lxyi.logdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class LogDemoApplication {

    public static void main(String[] args) {
      log.info("启动")  ;
        SpringApplication.run(LogDemoApplication.class, args);
    }

}
