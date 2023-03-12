package top.lxyi.controller;

import org.springframework.web.bind.annotation.*;
import top.lxyi.entity.Person;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/restful")
public class RestfulController {
    @GetMapping("/request")
    public String doGetRequest(){
        return "{\"message\":\"返回查询结果\"}";
    }
    @PostMapping("/request/{rid}")
    public String doPostRequest(@PathVariable("rid") Integer requestId,Person person){
        System.out.println(person.getName()+":"+person.getAge());
        return "{\"message\":\"数据新建成功\",\"id\":"+ requestId +"}";
    }
    @PutMapping("/request")
    public String doPutRequest(Person person){
        System.out.println(person.getName()+":"+person.getAge());
        return "{\"message\":\"数据更新成功\"}";
    }
    @DeleteMapping("/request")
    public String doDeleteRequest(){
        return "{\"message\":\"数据删除成功\"}";
    }
    @GetMapping("/person1")
    public Person findByPersonId(Integer id){
        Person p = new Person();
        if (id == 1){
            p.setName("lily");
            p.setAge(23);
        }else if (id == 2){
            p.setName("smith");
            p.setAge(22);
        }
        return p;
    }
    @GetMapping("/person2")
    public List<Person> findPersons(){
        List<Person> list = new ArrayList<>();
        Person p1=new Person();
        p1.setName("lily");
        p1.setAge(23);
        list.add(p1);
        return list;
    }
}
