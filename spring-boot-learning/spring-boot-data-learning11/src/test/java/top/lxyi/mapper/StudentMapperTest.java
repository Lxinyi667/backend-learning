package top.lxyi.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.lxyi.domain.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class StudentMapperTest {
     @Resource
        private StudentMapper studentMapper;

    /**
     * 单表增删改查测试
     */
    @Test
    void findById(){
        Student student = studentMapper.findById(1001);
        System.out.println(student);
    }
    @Test
    void insert(){
        Student student = new Student();
        student.setClazzId(1);
        student.setStudentName("lxy");
        student.setHometown("江苏-南京");
        student.setBirthday(LocalDate.now());
        studentMapper.insert(student);
        System.out.println(student.getStudentId());
    }
    @Test
    void update(){
        Student student = new Student();
        student.setStudentId(1001);
        student.setClazzId(2);
        student.setStudentName("lxy2");
        student.setHometown("江苏-南京");
        student.setBirthday(LocalDate.now());
        studentMapper.update(student);
    }
    @Test
    void deleteById(){
        studentMapper.deleteById(1002);
    }

    /**
     * 单表over
     */

    /**
     * 一对多关联查询
     */
     @Test
        void getStudent(){


         Student student = studentMapper.getStudent(1003);
         assertEquals("张智康",student.getStudentName());
         assertEquals(1,student.getClazz().getClazzId());
         System.out.println(student);
     }
     @Test
    void batchInsert(){
         List<Student> students = new ArrayList<>();
         for (int i =0;i<100;i++){
             Student student = Student.builder()
                     .studentId(4000+i)
                     .clazzId(1)
                     .studentName("测试学生"+1)
                     .hometown("南京")
                     .birthday(LocalDate.of(2003,10,10))
                     .build();
             students.add(student);
         }
         int count= studentMapper.batchInert(students);
         System.out.println(count);
     }
     @Test
    void batchUpdate(){
         List<Student> students = new ArrayList<>();
         for (int i = 0; i < 50; i++) {
             Student student = Student.builder()
                     .studentId(3000+i)
                     .clazzId(1)
                     .studentName("新名字"+i)
                     .hometown("苏州")
                     .build();
             students.add(student);
         }
         int count = studentMapper.batchUpdate(students);
         System.out.println(count);
     }
     @Test
     void batchDelete(){
        List<Integer> idList = List.of(3000,3001,3002,3003);
        int count = studentMapper.batchDelete(idList);
         System.out.println(count);
     }
     @Test
    void dynamicSelect(){
         Student student = Student.builder().hometown("州").build();
         List<Student> students = studentMapper.dynamicSelect(student);
         students.forEach(s->{
                     System.out.println(s.getClazzId()+","
                             +s.getStudentName()+","
                             +s.getHometown()+","
                             +s.getBirthday()+","
                     );
                 });
     }

}