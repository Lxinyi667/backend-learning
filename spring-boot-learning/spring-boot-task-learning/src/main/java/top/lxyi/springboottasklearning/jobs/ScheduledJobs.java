package top.lxyi.springboottasklearning.jobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class ScheduledJobs {
//    表示方法执行完5s后继续执行
//    @Scheduled(fixedDelay = 5000)
//    public void fixedDelayJob() throws InterruptedException {
//        log.info("fixedDelay开始：---->"+ LocalDateTime.now());
//        sleep(10*1000);
//        log.info("fixedDelay结束：---->"+ LocalDateTime.now());
//    }
//    表示方法执行3s后继续执行
//@Scheduled(fixedRate = 3000)
//    public void fixedRateJob() throws InterruptedException {
//        log.info("fixedRate开始：---->"+ LocalDateTime.now());
//        sleep(10*1000);
//        log.info("fixedRate结束：---->"+ LocalDateTime.now());
//    }
    //cron表达式
        @Scheduled(cron = "0 19 15 4 4 ? ")
    public void cronJob() {
        log.info("Happy Birthday---->"+ LocalDateTime.now());

    }
}
