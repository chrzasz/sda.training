package sda.homework;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  12:15 PM
 */
public class Silnia {

    int i=0;
    long silnia=1;

    public Silnia(int i) {
        this.i = i;
    }

    public long silniaRecur(int i) {
        if (i < 1)
            return 1;
        else
            return ( i * silniaRecur(i - 1) );
    }

    public void silniaIter(int i) {
        while (i > 1) {
            this.silnia = this.silnia * i;
            i -= 1;
        }
    }


}

