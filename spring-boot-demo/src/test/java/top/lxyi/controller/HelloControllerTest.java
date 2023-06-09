package top.lxyi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class HelloControllerTest {
@Autowired
    private HelloController helloController;
    @Test
    void hello(){
        String hello = helloController.hello();
        System.out.println(hello);
    }
}