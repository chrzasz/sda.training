package sda.training.point;

/**
 * Created by Grzegorz Chrzaszczyk on 29-09-2018  10:19 AM
 */
public class Point {

    //definicja pol
    private int x;  //=0
    private int y;

    //konstruktory
    //1 - konstruktor domyslny, ustawia wartosci domyslne obiektow klasy Point
    public Point() {
        //domyslna wartosc
        this.x = 0; //x = 0
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //metody liczace
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    //-5 ^ 2 = 25, 5 ^ 2 = 25

    //przeciazone metody liczace
    public double distance(Point another) {
        //return Math.sqrt(Math.pow(this.x - another.getX(), 2) + Math.pow(this.y - another.getY(), 2));
        //nie ma sensu dublowac kodu, wystarczy przekazac odpowiednie parametry
        return distance(another.getX(), another.getY());
        //logika liczaca znajduje sie tylko w jednym miejscu - w razie koniecznosci, modyfikacji podlega tylko jedna, bazowa metoda
    }

    public double distance() {
        return distance(0, 0);
    }

    //toString
    public String toString() {
        //utworzenie napisu poprzez konkatencje wartosci pol i statycznych znakow
        return "(" + x + ", " + y + ")";
    }

    //custom getter & setter
    public int[] getXY() {
        int[] tab = new int[2]; //deklaracja i inicjalizacja nowej tablicy 2 -elementowej typu int
        tab[0] = this.x;
        tab[1] = this.y;
        return tab; //zwracamy typ zgodny z sygnatura - czyli int[]

        //mozliwy krotszy zapis
        //return new int[] {x, y};
    }

    public void setXY(int x, int y) {
        //jezeli w setterach jest jakas walidacja, to zadziala
        //nie musimy dublowac logiki walidacji
        setX(x);
        this.setY(y);   //mozna zapisac z this, nie trzeba
    }

    //getters & setters
    //wygenerujemy Alt + Insert
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}