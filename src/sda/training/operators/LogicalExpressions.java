package sda.training.operators;

/**
 * Created by Grzegorz Chrzaszczyk on 15-09-2018  03:41 PM
 */
public class LogicalExpressions {
    public static void main(String[] args) {
        System.out.println(3 == 3 && 3 == 4);
        System.out.println(3 != 5 || 3 == 5);
        System.out.println((2+4) > (1+3));
        System.out.println("cos".equals("cos"));
        System.out.println("cos" == "cos");
    }
}
