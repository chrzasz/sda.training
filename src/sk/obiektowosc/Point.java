package sk.obiektowosc;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  08:36 PM
 */
public class Point {
    int x;
    int y;
    String name;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Point(@NotNull Point pkt) {
        x = pkt.x;
        y = pkt.y;
        name = pkt.name;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseX(){
        this.x++;
    }
    public void increaseY(){
        this.y++;
    }

    public void increaseXY(){
        increaseX();
        increaseY();
    }

    public void modifyX(int x) {
        this.x=x;
    }

    public void modifyY(int y) {
        this.y=y;
    }

    public void modifyYX(int x, int y) {
        modifyX(x);
        modifyY(y);
    }

    public void show() {
        System.out.print("Coordinates " + name + " are: " + x + "," + y);
    }



}
