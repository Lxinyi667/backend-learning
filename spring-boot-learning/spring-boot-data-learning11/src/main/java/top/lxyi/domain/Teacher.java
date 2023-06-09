package top.lxyi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Teacher {
    private Integer teacherId;
    private String teacherName;
    private Integer clazzId;
//    在一方中声明另一方对象(关联查询)
    private Clazz clazz;
}
