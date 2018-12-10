package sda.homework;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  01:25 PM
 */
public class InvertInputText {

    String input;
    String output;

    public InvertInputText(String input) {
        this.input = input;
        this.output = invertTxt(input);
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public String invertTxt(String input) {

        this.input = "";
        this.output = "";

        int len = input.length();

        char[] array = new char[len];

        int size = array.length;

        for (int i = 0; i < len; i++) {
            array[i] = input.charAt(i);
        }

        for (int i = len - 1; i >= 0; i--) {
            this.output += " " + String.valueOf(array[i]);
        }

        return this.output;
    }

}
