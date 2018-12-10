package sda.training.wprowadzenie;

/**
 * Created by Grzegorz Chrzaszczyk on 29-09-2018  10:25 AM
 */
public class Line {

    //agregacja - nasza klasa sklada sie z innych klas
    private Point begin;
    private Point end;

    //przeciazony konstruktor bo nie ma this.x
    public Line (int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1,y1);
        this.end = new Point(x2,y2);
    }


    //standardowy konstruktor
    public Line (Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }


    public int getBeginX() {
        return this.begin.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int[] getBeginXY() {
        return this.begin.getXY();
    }

    public int[] getEndXY() {
        return this.end.getXY();
    }

    public void setBeginX( int x) {
        this.begin.setX(x);
    }

    public void setBeginY( int y) {
        this.begin.setY(y);
    }

    public void setEndX( int x) {
        this.end.setX(x);
    }

    public void setEndY( int y) {
        this.end.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x,y);

    }

    public double getLength(){

        return begin.distance(end);
    }



/*
    public String ToString() {

        return "Odcinek: [poczatek = ( " + getBeginXY() + " ), koniec = (" + getEndXY() + ")]";

    }*/

    // po wpisaniu toString podpowie nam @Override
    // kompilator zglosi blad jesli nie ma jej w klasie dziedzica
    @Override
    public String toString() {
        return "Odcinek: [poczatek = " + begin + " , koniec = " + end + "]";
    }


}

