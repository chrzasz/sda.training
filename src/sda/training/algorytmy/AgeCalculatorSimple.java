package sda.training.algorytmy;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 18-10-2018  10:07 PM
 */
public class AgeCalculatorSimple {

    public static void main(String[] args) throws Exception {

        int birthYYYY, birthMM, birthDD;
        Month birthMonth;
        String str;

//        for (Month m : Month.values())
//            System.out.println(m);


        Scanner console = new Scanner(System.in);
        System.out.print("Enter year of your birth in [yyyy] format : ");
        str = console.next();
        birthYYYY = Integer.parseInt(str);
        System.out.print("Enter month of your birth : ");
        str = console.next();
        birthMM = Integer.parseInt(str);
        Month[] months = Month.values();
        birthMonth = months[birthMM-1];
        System.out.print("Enter day of your birth : ");
        str = console.next();
        birthDD = Integer.parseInt(str);

        LocalDate today = LocalDate.now(); //Today's date
        LocalDate birthday = LocalDate.of(birthYYYY, birthMonth, birthDD);  //Birth date
        Period p = Period.between(birthday, today);
        System.out.println("You have: " + p.getYears() + " years, " +
                p.getMonths() + " Months and " + p.getDays() + " days");
    }
/*
    public static Month getMonth(int birthMM) {

        switch (birthMM) {
            case 1:
                return Month.JANUARY;
            case 2:
                return Month.FEBRUARY;
            case 3:
                return Month.MARCH;
            case 4:
                return Month.APRIL;
            case 5:
                return Month.MAY;
            case 6:
                return Month.JUNE;
            case 7:
                return Month.JULY;
            case 8:
                return Month.AUGUST;
            case 9:
                return Month.SEPTEMBER;
            case 10:
                return Month.OCTOBER;
            case 11:
                return Month.NOVEMBER;
            case 12:
                return Month.DECEMBER;
            default:
                return Month.JANUARY;
        }
    }
    */

}
