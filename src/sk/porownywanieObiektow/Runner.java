package sk.porownywanieObiektow;

/**
 * Created by Grzegorz Chrzaszczyk on 13-10-2018  11:03 AM
 */
public class Runner {

    public static void main(String[] args) {

        Human human1 = new Human("Jan", "Kowalski", "850223000000");
        Human human2 = new Human("Jan", "Kowalski", "891213000000");
        Human human3 = new Human("Jan", "Kowalski", "850223000000");

        System.out.println(human1 + " == " + human2 + " " + human1.equals(human2));
        System.out.println(human2 + " == " + human3 + " " + human2.equals(human3));
        System.out.println(human1 + " == " + human3 + " " + human1.equals(human3));

        rawTypesComparison();
        rawFloatingPointComparison();
        objectsComparison();
        customObjectsComparison();

    }

    private static void customObjectsComparison() {
        Chair chair1 = new Chair("Adde", "IKEA", 2016);
        Chair chair2 = new Chair("Janinge", "IKEA", 2016);
        Chair chair3 = new Chair("Adde", "IKEA", 2015);
        Chair chair4 = new Chair("Adde", "IKEA", 2016);

        System.out.println("chair1.equals(chair2): " + chair1.equals(chair2));
        System.out.println("chair1.equals(chair3): " + chair1.equals(chair3));
        System.out.println("chair1.equals(chair4): " + chair1.equals(chair4));
        System.out.println("chair1.equals(null): " + chair1.equals(null));
    }

    private static void objectsComparison() {
        System.out.println("test == test: " + (new String("test") == new String("test")));
        System.out.println("test equals test: " + new String("test").equals(new String("test")));

        String reference1 = new String("something");
        String reference2 = reference1;
        System.out.println("reference1 == reference2: " + (reference1 == reference2));
    }

    private static void rawFloatingPointComparison() {
        System.out.println("0.3 == 0.1 + 0.2: " + (0.3 == 0.1 + 0.2)); // !!!
        System.out.println("0.3 == 0.1 + 0.2: " + (Math.abs(0.3 - (0.1 + 0.2)) < 0.000001));
    }

    private static void rawTypesComparison() {
        System.out.println("10 == 10: " + (10 == 10));
        System.out.println("10 != 10: " + (10 != 10));
        System.out.println("true == true: " + (true == true));
        System.out.println("true != true: " + (true != true));
        System.out.println("'a' == 'a': " + ('a' == 'a'));
        System.out.println("'a' != 'a': " + ('a' != 'a'));
        System.out.println("500L == 500L: " + (500L == 500L));
        System.out.println("500L != 500L: " + (500L != 500L));
    }
}



