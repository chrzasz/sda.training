package sda.homework;

/**
 * Created by Grzegorz Chrzaszczyk on 25-10-2018  06:46 AM
 */
public class IntToBin {

    private Integer intValue;
    private String binValue;

    public IntToBin() {
        this.intValue = null;
        this.binValue = "";
    }

    public IntToBin(Integer intValue, String binValue) {
        this.intValue = intValue;
        this.binValue = binValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public String getBinValue() {
        this.binValue = Integer.toBinaryString(this.intValue).toString();
        return binValue;
    }


}
