package top.lxyi.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.lxyi.domain.Student;
import top.lxyi.mapper.StudentMapper;

@Service
public class StudentService {
    @Resource
    private StudentMapper studentMapper;

    public Student findStudent(int id) {
        return studentMapper.getStudent(id);
    }
}
