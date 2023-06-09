package top.lxyi.xx.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Random;


@Controller
@Slf4j
public class SseController {
    @RequestMapping(value = "/sse/msg",method = RequestMethod.GET,produces = "text/event-stream;charset=UTF-8")
    public ResponseBodyEmitter pushMsg(){
        SseEmitter emitter = new SseEmitter(2L);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        String formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis());


        Random r = new Random();
        int i=r.nextInt(50);
        String msg = formatter+"当前股票价格为："+i;

        try {
            emitter.send(msg, MediaType.TEXT_EVENT_STREAM);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return emitter;

    }
}
