package top.lxyi.spring.ioc.entity;

public class Cloth {
    private String style;
    private String color;

    public Cloth(String style, String color) {
        this.style = style;
        this.color = color;
    }

    public Cloth() {
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color+style;
    }
}
