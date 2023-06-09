package top.lxyi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.lxyi.interceptro.LoginInterceptor;
import top.lxyi.interceptro.OldLoginInterceptor;
import top.lxyi.interceptro.AdminInterceptor;

//编写配置类来完成拦截器的设置
@Configuration
//添加注解框架才能读取这个类---》实现接口‘WebMvcConfigurer’--->重写addInterceptors方法
//注册拦截器---》在方法中实现具体代码
public class InterceptorConfigurer implements WebMvcConfigurer {
    //1.重写方法，注册拦截器

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor());
        // Old Login url, no longer use.
        // Use OldURLInterceptor to redirect to a new URL.
        registry.addInterceptor(new OldLoginInterceptor())//
                .addPathPatterns("/admin/oldLogin");

        // This interceptor apply to URL like /admin/*
        // Exclude /admin/oldLogin
        registry.addInterceptor(new AdminInterceptor())//
                .addPathPatterns("/admin/*")//
                .excludePathPatterns("/admin/oldLogin");
    }
}
