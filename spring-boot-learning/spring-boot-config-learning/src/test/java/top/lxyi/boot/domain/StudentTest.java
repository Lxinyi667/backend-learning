package top.lxyi.boot.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentTest {
    @Autowired
    private Student student;
    @Test
    void testStudent(){
        System.out.println(student);
    }
}