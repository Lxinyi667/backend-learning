package top.lxyi.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.lxyi.domain.Teacher;

@SpringBootTest
class TeacherMapperTest {
    @Resource
    private TeacherMapper teacherMapper;
     @Test
        void selectOneByOne(){
         Teacher teacher = teacherMapper.selectOneByOne(1);
         System.out.println(teacher);
     }

}