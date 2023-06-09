package top.lxyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import top.lxyi.event.MyEvent;
import top.lxyi.event.MyListener1;

@SpringBootApplication
//@ServletComponentScan
public class SpringBootLaunchApplication {
    public static void main(String[] args) {

//        SpringApplication.run(SpringBootLaunchApplication.class,args);
//        获取ConfigurableApplicationContext上下文
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootLaunchApplication.class,args);
//        装载Mylistener1 监听
        context.addApplicationListener(new MyListener1());
//        发布事件
        context.publishEvent(new MyEvent("测试事件"));
    }
}