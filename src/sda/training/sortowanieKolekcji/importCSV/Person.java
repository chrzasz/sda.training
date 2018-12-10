package sda.training.sortowanieKolekcji.importCSV;

/**
 * Created by Grzegorz Chrzaszczyk on 27-10-2018  10:53 PM
 */
public class Person {


    private String id,first_name,last_name,email,gender,ip_address,age,insurance_number;

//    private int id;
//    private String first_name, last_name, email;
//    private char gender;
//    private String ip_address;
//    private int age;
//    private long insurance_number;

    public Person() {
    }

    public Person(String id, String first_name, String last_name, String email, String gender, String ip_address, String age, String insurance_number) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ip_address = ip_address;
        this.age = age;
        this.insurance_number = insurance_number;
    }

    public Person(String id) {
        this.id = id;
        this.first_name = "";
        this.last_name = "";

    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", ip_address='" + ip_address + '\'' +
                ", age='" + age + '\'' +
                ", insurance_number='" + insurance_number + '\'' +
                '}';
    }
}
