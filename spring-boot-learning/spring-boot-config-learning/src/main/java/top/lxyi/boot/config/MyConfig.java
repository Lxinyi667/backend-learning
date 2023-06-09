package top.lxyi.boot.config;

import org.springframework.context.annotation.Bean;
import top.lxyi.boot.service.MyService;

/**
 * 使用@Configuration编写自定义配置类
 */
//@Configuration
public class MyConfig {
/**
 * 将该方法的返回值，作为一个Bean,添加到Spring容器中,该Bean的id就是方法名
 * 返回MyService实例
 */

    @Bean
    public MyService myService(){
        return new MyService();
    }
}
