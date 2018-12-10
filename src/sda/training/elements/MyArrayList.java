package Elements;

/**
 * Created by Grzegorz Chrzaszczyk on 30-09-2018  12:42 PM
 */
public class MyArrayList < E > {

    private Object[] tab = new Object[3];
    private int nextIndex = 0;

    public void add(E e) {
        if(nextIndex < tab.length) {
            tab[nextIndex] = e;
            nextIndex++;
        }
        else {
            System.out.println("Brak miejsca w tablicy!");
        }
    }

    public E get(int index) {
        if(index < tab.length) {
            return (E)tab[index];
        }
        else {
            System.out.println("Index poza zakresem! Zwracam index 0");
        }
        return (E)tab[0];
    }

}


