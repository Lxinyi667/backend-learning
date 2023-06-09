package top.lxyi.springboottasklearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class TastConfig {
    @Bean
    public Executor taskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 核心线程数
        executor.setCorePoolSize(12);
        // 最大线程数
        executor.setMaxPoolSize(26);
        // 线程队列数量
        executor.setQueueCapacity(200);
        // 允许核心线程超时时间
        executor.setKeepAliveSeconds(120);
        // 关闭前等待时间
        executor.setWaitForTasksToCompleteOnShutdown(true);
        // 设置线程池中任务的等待时间，如果超过这个时间还么有销毁就强制销毁，以确保应用最后能够被关闭，而且必须要关闭
        executor.setAwaitTerminationSeconds(180);
        // 线程名的前缀，定位是哪个线程
        executor.setThreadNamePrefix("taskExecutor-");
        // 拒绝线程接入
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        return executor;
    }
}
