package sda.training.sortowanieKolekcji.importCSV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Grzegorz Chrzaszczyk on 27-10-2018  10:59 PM
 */
public class Runner {


    public static void main(String[] args) {

        final String SEPARATOR = ",";
        String dataLine = "";
//        String[] values = {""};

//        Person person1 = new Person("1","John","Bravo", "johnbravo@ac.aa", "M", "192.168.0.1","30","97123129879873" );
//        System.out.println(person1);

        String fileName = "data_for_comparator_MOCK_DATA.csv";

        List lst = readFileInList(fileName);
        Iterator<String> itr = lst.iterator();
        int cnt = 0;
        while (itr.hasNext()) {
            cnt++;
            String dataLine1 = itr.next();
            String[] values1 = dataLine1.split(",");

            for (int i = 0; i < values1.length; i++) {
                System.out.print(values1[i] + "\t-\t" );
            }
            System.out.println("");


        }

        System.out.println("----------------- List size: " + lst.size());





//        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
//            stream.forEach(System.out::println);
//        }catch (IOException e) {
//            e.getMessage();
//        }

    } // END main


    public static List<String> readFileInList(String fileName) {

        /*
        This method recognizes the following as line terminators:
        \u000D followed by \u000A, CARRIAGE RETURN followed by LINE FEED
        \u000A, LINE FEED
        \u000D, CARRIAGE RETURN
         */

        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
//            lines.remove(0); //remove header
        } catch (IOException e) {
            // do something
            e.printStackTrace();
        }
        return lines;
    }


}
