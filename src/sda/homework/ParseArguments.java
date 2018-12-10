package sda.homework;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  12:12 PM
 */
public class ParseArguments {


    public ParseArguments() {
    }

    public ParseArguments(String[] args) {

    }

    public int getIntArg1(String[] args) {

        int arg1=0;

        if (args.length > 0) {
            String strArg1 = args[0];
            arg1 = Integer.parseInt(strArg1);
        }

        return arg1;
    }


}
