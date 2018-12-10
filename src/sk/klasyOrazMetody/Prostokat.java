package sk.klasyOrazMetody;

/**
 * Created by Grzegorz Chrzaszczyk on 29-08-2018  08:32 PM
 */
public class Prostokat {

    private int a, b;

    private String nazwaProstokta;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public Prostokat(int a, int b, String nazwaProstokata) {
        this.a = a;
        this.b = b;
        this.nazwaProstokta = nazwaProstokata;
    }

    //RMB -> Generate: Getter and Setter
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getNazwaProstokta() {
        return nazwaProstokta;
    }

    public void setNazwaProstokta(String nazwaProstokta) {
        this.nazwaProstokta = nazwaProstokta;
    }

    public void test() {
        System.out.println("Hello World");
    }

    public void test(String jakisTekst) {
        System.out.println(jakisTekst);
    }

    public int test(int a, int b) {
        return a * b;
    }

}
