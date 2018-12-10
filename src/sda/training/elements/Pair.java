package Elements;

/**
 * Created by Grzegorz Chrzaszczyk on 30-09-2018  12:24 PM
 */
public class Pair<K, V> {

    private K key;
    private V value;


    public Pair(K key, V value) {

        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {

        Pair map1 = new Pair<Integer, Integer>(1,1);

        System.out.println(map1);

        Pair<String,String> map2 = new Pair<>("aaabbb","AAABBB");

        System.out.println(map2);


        //Pair

    }
}
