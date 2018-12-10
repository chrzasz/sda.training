package sda.training.wprowadzenie;

/**
 * Created by Grzegorz Chrzaszczyk on 29-09-2018  02:19 PM
 */
public class PersonRunner {

    public static void main(String[] args) {

        Person person1 = new Person ("Wiesio", "Grzybowska 123");
        Person person2 = new Person ("Adam", "Wisla 1");

        Student student1 = new Student("Ala","ma kota");

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(student1);

        student1.addCourseGrade("Math", 4);
        student1.addCourseGrade("Bio", 4);
        student1.addCourseGrade("Geo", 3);
        student1.addCourseGrade("Lang", 3);

        System.out.println(student1);
        System.out.println(student1.getAverageGrade());
        System.out.println(student1.calcAvg());
        System.out.println(student1.getName());


    }
}
