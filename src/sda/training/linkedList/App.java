package sda.training.linkedList;

/**
 * Created by Grzegorz Chrzaszczyk on 20-10-2018  10:52 AM
 */
public class App {
    public static void main(String[] args) {
        SdaListImpl list = new SdaListImpl();

        System.out.println("-----Lista ma:" + list.size());

        System.out.println("IsEmpty?: " + list.isEmpty());
        System.out.println("-----Lista ma:" + list.size());
        list.removeFirst();
        list.addFirst(3);
        System.out.println("-----Lista ma:" + list.size());
        list.addFirst(2);
        System.out.println("-----Lista ma:" + list.size());
        list.addFirst(1);

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.addFirst(0);


        System.out.println("HEAD:" + list.head.value);
        System.out.println("GET FIRST:" + list.getFirst());

        list.removeFirst();
        System.out.println("GET FIRST:" + list.getFirst());
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        System.out.println("GET FIRST:" + list.getFirst());

        System.out.println("-----Lista ma:" + list.size());

//        list.clear();

        System.out.println("IsEmpty?: " + list.isEmpty());

        System.out.println("-----Lista ma:" + list.size());

        list.addLast(60);

        System.out.println(">>>>>GET LAST:" + list.getLast());

        System.out.println("GET = "+ list.get(1));
    }
}
