package top.lxyi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lxyi.entity.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@RestController
public class CourseController {
    @GetMapping("course")
    public Map<String,Object> getCourse(){
        Map<String,Object> response = new HashMap<>();
        Course course = new Course(1L,"spring boot" ,false);
        List<Course> list = new ArrayList<>();
        list.add(course);
        response.put("code",200);
        response.put("msg","success");
        response.put("data",getCourseData(list));
        return response;
    }

    public Map<String,List<Course>> getCourseData(List<Course> courses){
//        在此处添加获取课程数据的逻辑
        Map<Boolean,List<Course>> courseByFinished = courses.stream()
                .collect(Collectors.partitioningBy(course -> course.isFinished()
                ));
        Map<String,List<Course>> result = new HashMap<>();
        result.put("finished",courseByFinished.get(true));
        result.put("unfinished",courseByFinished.get(false));
        return result;
    }
}
