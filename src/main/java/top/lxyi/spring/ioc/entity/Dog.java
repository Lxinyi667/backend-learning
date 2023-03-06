package top.lxyi.spring.ioc.entity;

public class Dog {
   private String username;
   private Integer age;

    public Dog(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public Dog() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{"+
                "username='"+username+"’,age="+age+"}";
    }
}
