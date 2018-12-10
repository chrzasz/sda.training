package sda.training.sortowanieKolekcji.importCSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by Grzegorz Chrzaszczyk on 27-10-2018  11:29 PM
 */
public class ParseCsv {

    public static void main(String[] args) throws IOException {

        String fileName = "data_for_comparator_MOCK_DATA.csv";

//        File file = new File(fileName);
//        System.out.println(file.getCanonicalPath());

        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
//
//            String dataLine = lines.
//            String[] values = dataLine.split(",");

            lines.forEach(System.out::println);
        }catch (IOException e) {
            e.getMessage();
        }


        List<Person> people = new ArrayList<>();

//        people.add(new Person("862", "Matt", "Wyllis", "mwyllisnx@telegraph.co.uk", "Male", "189.217.196.92", "28", "78074572326"));
//        people.add(new Person("224","Lion","De la Perrelle","ldelaperrelle67@123-reg.co.uk","Male","238.130.127.97","37","43323147944"));
//
//        System.out.println("Iterowanie po liscie (foreach)");
//        for (Person p : people) {
//            System.out.println(p);
//        }

//        try {
//            while (stream.hasNext()) {
//                String dataLine = inputStream.next();
//                String[] values = dataLine.split(",");
//                System.out.println("DATA LINE: " + dataLine);
////                System.out.println(++cnt + " SizeOfValues = " + values.length);
//                people.add(new Person(
//                        values[0], // id
//                        values[1], // first_name
//                        values[2], // last_name
//                        values[3], // email
//                        values[4], // gender
//                        values[5], // ip_address
//                        values[6], // age
//                        values[7]  // insurance_number
//                        ));
//            }
//
//            inputStream.close();
//        } catch (IOException e) {
//            e.getMessage();
//        }

        System.out.println("Iterowanie po liscie (foreach)");
        for (Person p : people) {
            System.out.println(p);
        }


    }


}


