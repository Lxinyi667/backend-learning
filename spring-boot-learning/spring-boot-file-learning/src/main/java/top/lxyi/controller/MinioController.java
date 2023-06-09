package top.lxyi.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lxyi.config.MinioConfig;

@RestController
@Slf4j
public class MinioController {
@Resource
    private MinioConfig minioConfig;
    @GetMapping(value = "/make")
    public void makeBucket() throws Exception {
        minioConfig.makeBucket("lxy");
        log.info("makeSuccess");
    }
    @GetMapping(value = "/uploadOb")
        public void uploadOb() throws Exception {
        minioConfig.uploadObject("lxy","img/ddd.jpg","F://upload/20230410/11.jpg");
        log.info("uploadsuccess");
    }

}
