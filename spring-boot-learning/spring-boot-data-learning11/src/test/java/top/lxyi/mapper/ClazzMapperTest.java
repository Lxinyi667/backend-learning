package top.lxyi.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.lxyi.domain.Clazz;

@SpringBootTest
class ClazzMapperTest {
    @Resource
    private ClazzMapper clazzMapper;
    @Test
    void selectOneToMany(){
        Clazz clazz = clazzMapper.getClazz(1);
        System.out.println(clazz);
    }
}