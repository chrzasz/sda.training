package sda.training.instructions;

/**
 * Created by Grzegorz Chrzaszczyk on 16-09-2018  10:37 AM
 */
public class IfInstruction {
    public static void main(String[] args) {
        checkValues(2,2);
        checkValues(1,1);
        checkValues(984,984);
        checkValues(654,4325653);

        byte JohnAge = 25;
        byte AnnaAge = 18;
        byte MikeAge = 6;

        checkAgeIfAdult(JohnAge);
        checkAgeIfAdult(AnnaAge);
        checkAgeIfAdult(MikeAge);

    }

    public static void checkValues (int a, int b) {
        if (a-b==0) {
            System.out.println("OK: "+a+" - "+b+" == 0");
        } else System.out.println("ERROR: " + a + " - " + b + " <> 0" + "    >>>   (a-b)= " + (a - b));
    }

    public static void checkAgeIfAdult(byte a) {
        if (a>18) System.out.println(a + " -is adult");

    }
}
