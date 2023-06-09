package top.lxyi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Form {
    private String name;
    private String course;
    private List<String> purpose;


    //    @Override
//    public String toString() {
//        return super.toString();
//    }
}
