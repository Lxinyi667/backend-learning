package top.lxyi.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestDBConfig implements DBConfig{
    @Override
    public String configure() {
        return "test 环境数据库配置";
    }
}
