package top.lxyi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private Long code;
    private String msg;
    private boolean finished;
//    private List<Course> data;
//    @Override
//    public String toString() {
//        return "Course{"+
//                "code='"+code+'\''+
//                ",msg='"+msg+'\''+
//                ",list=["+data+'\''+
//                "]"+'}';
//    }
}
