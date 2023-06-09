package top.lxyi.logdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {
    @GetMapping("/logs")
    public void getLogs(){
        log.trace("Trace 日志");
        log.debug("debug 日志");
        log.info("info 日志");
        log.warn("warn日志");
        log.error("error日志");
    }
}
