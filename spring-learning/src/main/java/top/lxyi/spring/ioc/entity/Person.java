package top.lxyi.spring.ioc.entity;

import java.awt.*;

public class Person {
    private String sex;
    private Cloth cloth;


    public Person(String sex, Cloth cloth) {
        this.sex = sex;
        this.cloth = cloth;
    }
    public Person() {

    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String dress(){
        return this.sex +"穿着"+this.cloth;
    }


}
