package sk.interfejs;

/**
 * Created by Grzegorz Chrzaszczyk on 07-10-2018  11:21 PM
 */
public interface MicrowaveOven {
    void start();

    void setDuration(int durationInSeconds);

    boolean isFinished();

    void setPower(int power);

    default String getName() {
        return "MicrovaweOwen";
    }
}
