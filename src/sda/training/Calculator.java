package sda.training;

/**
 * Created by Grzegorz Chrzaszczyk on 15-09-2018  03:47 PM
 */
public class Calculator {

    //psvm
    public static void main(String[] args) {


        double a = 2.3, b = 3.5, c = 5.6;

        double x = oper1(2.3, 3.5, 5.6);
        System.out.println("oper1 = " + x);
        x = oper2(2.3, 3.5, 5.6);
        System.out.println("oper2 = " + x);

        a++;
        b++;

        double d = 3;
        double e = 5;
        double f = d++ + e;
        System.out.println("f=" + f);


    }

    public static double oper1(double a, double b, double c) {
        return (a + b) * c;
    }

    public static double oper2(double a, double b, double c) {
        return (a - b / c);
    }


}
