package top.lxyi.boot.prop;

import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//标注本类为配置类
@Configuration
//指定自定义文件的位置和名称
@PropertySource("classpath:my.properties")
//指定配置文件中的注入属性的前缀
@ConfigurationProperties(prefix = "my")
@Setter
@ToString
public class MyProperties {
    private String url;
    private String username;
    private String password;
}
