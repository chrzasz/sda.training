package sda.training.wprowadzenie;

import java.util.Arrays;

/**
 * Created by Grzegorz Chrzaszczyk on 29-09-2018  01:54 PM
 */
public class Student extends Person {

    private int numCourses=0;
    private String[] courses = {};
    private int[] grades = {};


    public Student() {
        super();
        courses= new String[0];
        grades=new int[0];
    }

    public Student(String name, String address) {

        super(name,address);

    }

    public void addCourseGrade(String course, int grade) {

        int size = grades.length;
        int[] updatedGrade = new int[size+1];
        String[] updatedCourses = new String[size+1];

        for (int i = 0; i < size; i++) {
            updatedCourses[i]=courses[i];
            updatedGrade[i] = grades[i];
        }

        updatedCourses[size] = course;
        updatedGrade[size] = grade;

        this.courses = updatedCourses;
        this.grades = updatedGrade;


        numCourses++;

    }

    public void printGrades() {
        for (int grade: grades) {
            System.out.println(grade);
        }

        for (int i =1; i< grades.length; i++) {
            System.out.println(courses[i] + ":" + grades[i]);
        }
    }


    public double calcAvg() {
        double avg = 0.0;
        if (grades.length != 0) {
            int sum = 0;
            for(int g:grades) sum += g;
            return sum/(1.0*grades.length);
        }
        return 0.0;
    }

    public double getAverageGrade() {

        int gradesSum = 0;
        int averageGrade = 0;

        for (int i = 0; i < grades.length; i++) {

            gradesSum += grades[i];

        }

        if(grades.length != 0) {
            averageGrade = gradesSum / grades.length;
        }

        return averageGrade;
    }

/*    @Override
    public String toString() {
        return "Student = " + super.toString() + "\nSrednia Ocen:" + this.calcAvg();
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name=" +
                "numCourses=" + numCourses +
                ", courses=" + Arrays.toString(courses) +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
/*
void addCourseGrade(String course, int grade)
1) Odczytac wielkosc tablicy (wystarczy jednej bo obie przechowuja tyle samo elementow) -> size
---> arr.length


2) Inicjalizuje nowe tablice o ilosc elementow (size + 1)
---> int[] tab = new int[size+1]


3) Kopiuje elementy ze starej tablicy do nowej tablicy - zostanie mi jedno miejsce puste (na nowy wpis)
---> stosujemy petle, np. for

4) W to miejsce puste dodajemy nowy wpis.
---> tab[size] = nowy_wpis

5) Do referencji do tablic przypisujemy nowe tablice.

double getAverageGrade() - wyznacza srednia arytmetyczna grades
w petli for przechodzimy tablice z grades, sumujemy je i dzielimy przez ilosc wpisow (dlugosc tablicy)
dodatkowo robimy zabezpieczenie przed dzieleniem przez 0 -> if(arr.length != 0) { ... } else { sout(...) }

 */