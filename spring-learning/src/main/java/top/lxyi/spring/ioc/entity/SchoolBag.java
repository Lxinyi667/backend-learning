package top.lxyi.spring.ioc.entity;

import java.util.List;

public class SchoolBag {
//    颜色
    private String color;
    private List<Pen> pencilCase;

    public SchoolBag(String color, List<Pen> pencilCase) {
        this.color = color;
        this.pencilCase = pencilCase;
    }

    public SchoolBag() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Pen> getPencilCase() {
        return pencilCase;
    }

    public void setPencilCase(List<Pen> pencilCase) {
        this.pencilCase = pencilCase;
    }

    @Override
    public String toString() {
        return "SchoolBag{"+
                "color='"+ color +'\'' +
                ",书包里有pencilCase="+pencilCase+
                '}';
    }
}
