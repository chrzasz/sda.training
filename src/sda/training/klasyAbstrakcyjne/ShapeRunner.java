package sda.training.klasyAbstrakcyjne;

/**
 * Created by Grzegorz Chrzaszczyk on 30-09-2018  10:24 AM
 */
public class ShapeRunner {
    public static void main(String[] args) {

//        Shape s0 = new Shape() ---> nie ma mozliwosci tworzenie instancji klasy abstrakcyjnej

        Shape s1 = new Rectangle("YELLOW",1,1);

        Shape r1 = new Rectangle("RED",1,2);
        Shape t1 = new Triangle("BLUE",12,6);


        System.out.println(s1);
        System.out.println(r1);
        System.out.println(t1);

        Shape[] shapes = {s1, r1, t1};
        double sum = 0.0;
        for (Shape s: shapes) {
            sum += s.getArea();
        }
        System.out.println("SUM = " + sum);

    }
}
