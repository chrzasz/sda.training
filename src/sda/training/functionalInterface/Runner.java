package sda.training.functionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

/**
 * Created by Grzegorz Chrzaszczyk on 07-10-2018  09:34 AM
 */
public class Runner {
    public static void main(String[] args) {

        Function<Integer, Boolean> divTwo = x -> x % 2 == 0 ? true : false;
        System.out.println(divTwo.apply(234234));

        BiPredicate<Point, Line> checkIfPointBelongsToLine = (Point p, Line l) -> p.y == (l.a * p.x + l.b) ? true : false;

        Point p1 = new Point(1, 3);
        Line l1 = new Line(2, 1);


        System.out.println(checkIfPointBelongsToLine.test(p1, l1));

        BiFunction<Integer, Integer, String> biFunction = (a, b) -> "Result:" +(a * b);
        System.out.println(biFunction.apply(20,25));

        BiPredicate<Integer, String> condition = (i,s)-> i>20 && s.startsWith("R");
        System.out.println(condition.test(10,"Ram"));
        System.out.println(condition.test(30,"Shyam"));
        System.out.println(condition.test(30,"Ram"));

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        BiConsumer<Integer,String> biConsumer = (key, value) ->
                System.out.println("Key:"+ key+" Value:"+ value);
        map.forEach(biConsumer);


        IntSupplier maxIntValue = ()-> Integer.MAX_VALUE;
        System.out.println(maxIntValue.getAsInt());

        IntSupplier minIntValue = ()-> Integer.MIN_VALUE;
        System.out.println(minIntValue.getAsInt());


    }


}

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Line {
    double a, b;

    public Line(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Line{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
