package top.lxyi.boot.domain;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonTest {
    @Resource
    private Person person;
@Test
    void testPerson(){
    System.out.println(person);

    }
}