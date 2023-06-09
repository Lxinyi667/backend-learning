package top.lxyi.boot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lxyi.boot.config.DBConfig;

@RestController
@AllArgsConstructor
public class DBController {
private final DBConfig dbConfig;

@GetMapping("/show")
    public String show(){
    return dbConfig.configure();
    }
}
