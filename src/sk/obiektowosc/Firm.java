package sk.obiektowosc;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  08:19 PM
 */
public class Firm {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setName("Staszek");
        employee1.setSurname("Ptaszek");
        employee1.setAge(35);

        Employee employee2 = new Employee("Wlodek", "Zieba", 45);

        Employee employee3 = new Employee("Lukasz");
        Employee employee4 = new Employee("Zdzislaw", "Gutek");

        System.out.println("Pracownicy firmy to:");
        System.out.println(employee1.getName() + " " + employee1.getSurname() + ", " + employee1.getAge() + " lat");
        employee2.show();System.out.println();
        employee3.show();System.out.println();
        employee4.show();System.out.println();


        Employee[] employees = new Employee[4];
        employees[0] = new Employee();
        employees[1] = new Employee("Staszek", "Kowalski", 34);
        employees[2] = new Employee("Ala", "Ma", 33, 3000);
        employees[3] = new Employee(employees[2]);

        for(Employee p: employees){
            p.showHR();
            System.out.println();
        }



        Boss gm = new Boss();
        gm.show();System.out.println();
        gm.showHR();System.out.println();

        Manager mng = new Manager(1);
        mng.show();System.out.println();
        mng.showHR();System.out.println();






    }


}
