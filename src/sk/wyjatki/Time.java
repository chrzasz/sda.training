package sk.wyjatki;

/**
 * Created by Grzegorz Chrzaszczyk on 09-10-2018  01:54 AM
 */
public class Time {



    public int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        }
        return hour * 60 * 60;
    }
}
