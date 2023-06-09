package top.lxyi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.lxyi.domain.Clazz;
import top.lxyi.domain.Student;
import top.lxyi.service.ClazzService;
import top.lxyi.service.StudentService;

@RestController
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;
    private final ClazzService clazzService;
    @GetMapping("{id}")
    public Student getStudent(@PathVariable int id){
        Student student = studentService.findStudent(id);
        Clazz clazz = clazzService.findClazz(student.getClazzId());
        student.getClazz().setTeacher(clazz.getTeacher());
        return student;
    }
}
