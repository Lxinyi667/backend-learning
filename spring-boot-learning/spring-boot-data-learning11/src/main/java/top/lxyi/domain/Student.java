package top.lxyi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private Integer studentId;
    private Integer clazzId;
    private String studentName;
    private String hometown;
    private LocalDate birthday;

    /**
     * 在多方中声明一方的对象
     */
    private Clazz clazz;
    /**
     * 学生和课程多对多
     */
    private List<Course> courses;
}