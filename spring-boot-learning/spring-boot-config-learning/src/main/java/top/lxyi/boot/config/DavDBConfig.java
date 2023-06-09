package top.lxyi.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")//指定多环境配置标识
public class DavDBConfig implements DBConfig{
    @Override
    public String configure() {
        return "dev 环境数据库配置";
    }
}
