package top.lxyi.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.lxyi.domain.Clazz;
import top.lxyi.mapper.ClazzMapper;

@Service
public class ClazzService {
    @Resource
    private ClazzMapper clazzMapper;

    public Clazz findClazz(Integer clazzId) {
        return clazzMapper.getClazz(clazzId);
    }
}
