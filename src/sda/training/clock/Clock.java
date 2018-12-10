package sda.training.clock;

/**
 * Created by Grzegorz Chrzaszczyk on 06-10-2018  09:44 AM
 */
public class Clock {

    private int minutes;
    private int hours;

    public Clock(int minutes, int hours) {
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public void addMinutes(int minutes){
        hours = ((hours *60 +this.minutes)+minutes)/60;
        this.minutes += minutes;



    }

    public void addClockTime(Clock another) {

    }


}



