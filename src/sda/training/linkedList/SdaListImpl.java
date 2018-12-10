package sda.training.linkedList;


/**
 * Created by Grzegorz Chrzaszczyk on 20-10-2018  10:40 AM
 */
public class SdaListImpl implements SdaList {

    Node head;

    public SdaListImpl() {
        this.head = null;
    }

    public SdaListImpl(Node head) {
        this.head = head;
    }

    public boolean isEmpty() {
        if (head == null)
        return true;
        else return false;
    }

    public int size() {
        int cnt=0;
        Node wsk;
        wsk = head;

        while (wsk != null) {
            cnt++;
            wsk = wsk.next;
        }
        return cnt;
    }

    public int getFirst() {
        return head.value;
    }

    public int getLast() {

        Node last = head;
        if (head == null) {
            return head.value;
        }else {
            while (last.next != null) {
                last = last.next;
            }
            return last.value;
        }
    }



    public int get(int index) {
        int sizeOfArray = index;
        int[] array = new int[sizeOfArray];
        return sizeOfArray;
    }

    public void clear() {
        head = null;
    }

    public void addFirst(int element) {
        System.out.print("jestem w addFirst dodaje:");
        Node temp = new Node();
        temp.value = element;
        temp.next = head;
        head = temp;
        System.out.println(head.value);

    }

    public void addLast(int element) {
        System.out.println("jestem w addLast");
        if (head == null) {
            System.out.print("dodaje pierwszy:");
            head = new Node();
            head.value = element;
            System.out.println(element);
        } else {
            System.out.println("dodaje kolejny:");
            Node current = head;
            while (current.next != null) {

                current = current.next;
                System.out.println("\tcurrent:" + current.value);
            }

            Node newNode = new Node();
            newNode.value = element;
            current.next = newNode;
            System.out.println("END addLast");
        }
    }

    public void removeFirst() {
        System.out.print("Kasuje pierwszy:");
        if (head == null) {
            System.out.println("Lista jest pusta");
        } else {
            System.out.println(head.value);
            head = head.next;
        }

    }

    public void removeLast() {

    }

    public void setAt(int index, int element) {

    }

    public void addAt(int index, int element) {

    }

    public void removeAt(int index) {

    }

    class Node {
        int value;
        Node next;
    }


}
