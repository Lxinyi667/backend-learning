package top.lxyi.domain;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
@Slf4j
class UserVoTest {
    @Test
    void beanCopyTest1(){
        User user =User.builder().id(1).password("123456").avatar("1.jpg").createTime(LocalDate.now())
                                    .build();
        UserVo userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setName(user.getName());
        userVo.setAvatar(user.getAvatar());
        log.info(String.valueOf(userVo));
    }
    @Test
    void beanCopyTest2(){
        User user =User.builder().id(1).password("123456").avatar("1.jpg").createTime(LocalDate.now())
                .build();
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user,userVo);
        log.info(String.valueOf(userVo));
    }
}