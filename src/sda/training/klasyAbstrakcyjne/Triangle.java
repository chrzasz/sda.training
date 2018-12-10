package sda.training.klasyAbstrakcyjne;

/**
 * Created by Grzegorz Chrzaszczyk on 30-09-2018  10:23 AM
 */
public class Triangle extends Shape {
//    super();
    private int a;
    private int h;


    public Triangle() {
        this.color = "transparent";
        this.a = 0;
        this.h = 0;
    }

    public Triangle(String color, int width, int heigh) {
        this.color = color;
        this.a = width;
        this.h = heigh;
    }

    public int getArea() {
//        int area;
        return (a * h)/2;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                ", color='" + color + '\'' +
                "} Powierzchnia = " +
                getArea();
    }
}
