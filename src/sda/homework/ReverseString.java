package sda.homework;

/**
 * Created by Grzegorz Chrzaszczyk on 25-10-2018  09:28 AM
 */
public class ReverseString {

    String input;
    String output;

    public ReverseString() {
        this.input = "";
        this.output = "";
    }

    public ReverseString(String input) {
        this.input = input;
        this.output = reverse(input);
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        String out = reverse(getInput());
        return out;
    }

    private String reverse(String input) {

        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(input);
        // reverse StringBuilder input1
        this.output =  input1.reverse().toString();
        return this.output;

    }








}
