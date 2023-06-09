package top.lxyi.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

//@Configuration
public class FilterRegistration {
    @Bean
    public FilterRegistrationBean<?> filterRegistrationBean(){
        FilterRegistrationBean<CustomFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CustomFilter());

        registration.addUrlPatterns("/*");
        registration.setOrder(10);
        return registration;
    }
}
