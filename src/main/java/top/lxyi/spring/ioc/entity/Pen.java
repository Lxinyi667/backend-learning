package top.lxyi.spring.ioc.entity;

public class Pen {
//    笔的名称（例如：铅笔、钢笔等）
    private String name;

    public Pen(String name) {
        this.name = name;
    }

    public Pen() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pen{"+
                "name='"+name+'\''+
                '}';
    }
}
