package sda.training.algorytmy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 18-10-2018  09:37 PM
 */
public class DataCzas {

    public static void main(String[] args) throws Exception {


        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = format.format( new Date()   );
        Date dateNow = new Date(); // to samo co LocalDateTime.now()
        System.out.println("Today is : " + format.format(dateNow));

        Scanner console = new Scanner(System.in);


        System.out.print("Enter date of your birth in [dd-MM-yyyy] format : " );

        dateString = console.next();
        Date birthDate = new SimpleDateFormat ("dd-MM-yyyy").parse(dateString);

        System.out.println("Birth date: "+ format.format(birthDate));

        System.out.println( (dateNow.getTime() - birthDate.getTime() ));


        LocalDate start = LocalDate.of(1996, 2, 29);
        LocalDate end = LocalDate.of(2014, 2, 28); // use for age-calculation: LocalDate.now()
        long years = ChronoUnit.YEARS.between(start, end);
        System.out.println(years); // 17


        long currentDateTime = System.currentTimeMillis();

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentDateTime);

        Date currentDate = new Date(currentDateTime);
        DateFormat df = new SimpleDateFormat("dd-MM-yy");
        System.out.println("Milliseconds to Date: " + df.format(currentDate));

        //Converting milliseconds to Date using Calendar
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(currentDateTime);
        System.out.println("Milliseconds to Date using Calendar:" + df.format(cal.getTime()));

        //copying one Date's value into another Date in Java
        Date now = new Date();
        Date copiedDate = new Date(now.getTime());

        System.out.println("original Date: " + df.format(now));
        System.out.println("copied Date: " + df.format(copiedDate));


        int mYear = calendar.get(Calendar.YEAR);
        int mMonth = calendar.get(Calendar.MONTH);
        int mDay = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("YEAR: " + mYear + " MONTH: " + mMonth + " DAY: " + mDay);
    }




}
