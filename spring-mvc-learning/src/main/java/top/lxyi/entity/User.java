package top.lxyi.entity;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
//    private Date createTime;

    public User(Integer id,String username, String password) {
        this.id=id;
        this.username = username;
        this.password = password;
//        this.createTime = createTime;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{"+
                "id='"+id+'\''+
                "username='"+username+'\''+
                ",password='"+password+'\''+
                '}';
    }
}
