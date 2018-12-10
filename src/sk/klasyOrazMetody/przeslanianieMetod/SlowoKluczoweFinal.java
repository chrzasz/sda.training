package sk.klasyOrazMetody.przeslanianieMetod;

final public class SlowoKluczoweFinal {

    final private int STALA; //cos jak conts

    SlowoKluczoweFinal() {
        STALA = 10;
    }

    final public void test() {
        final int KOLEJNA_STALA = 10;
        System.out.println(STALA + KOLEJNA_STALA);
    }
}
