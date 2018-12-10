package sk.obiektowosc;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  10:13 PM
 */
public class Point3D extends Point{
    int z;


    public Point3D() {
        super.x = 0;
        super.y = 0;
        super.name="3D_default";
        this.z = 0;
    }


    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(int x, int y, String name) {
        super(x, y, name);
        this.z = 0;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("," + this.z);

    }
}
