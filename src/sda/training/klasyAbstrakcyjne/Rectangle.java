package sda.training.klasyAbstrakcyjne;

/**
 * Created by Grzegorz Chrzaszczyk on 30-09-2018  10:14 AM
 */
public class Rectangle extends Shape {
    //super();/**/
    private int a;
    private int b;


    public Rectangle() {
        this.color = "transparent";
        this.a = 0;
        this.b = 0;
    }

    public Rectangle(String color, int width, int heigh) {
        this.color = color;
        this.a = width;
        this.b = heigh;
    }


    @Override
    public int getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", color='" + color + '\'' +
                "} Powierzchnia = " +
                getArea();
    }
}
