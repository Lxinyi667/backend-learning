package top.lxyi.config;


import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.lxyi.interceptro.AuthInterceptor;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
@Configuration
public class MvcConfig implements WebMvcConfigurer {
//    private final String[] excludePath = {"/static"};
    private final String[] excludePath = {"/css/**","/images/**","/api/login"};
    @Resource
    private AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(authInterceptor).addPathPatterns("/**").excludePathPatterns(excludePath);
    }
}
