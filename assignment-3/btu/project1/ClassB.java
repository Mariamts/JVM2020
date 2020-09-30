package btu.project1;

public class ClassB {
    public int a;
    public int b;
    public int c;

    public void firstmethod (int x, int y, int z) {
        a=x;
        b=y;
        c=z;
    }

    public void scndmethod (int x, int y, int z) {
        if (x > y && x > z) {
            System.out.print("max number is " + y);
        }
        if (y > x && y > z) {
            System.out.print("max number is " +y);
        }
        if (z > y && z > x) {
            System.out.print("max number is " +z);
        }
    }

    public void thirdmethod (int x, int y, int z) {
        if (x < y && x < z) {
            System.out.print("min number is " +x);
        }
        if (y < x && y < z) {
            System.out.print("min number is " +y);
        }
        if (z < y && z < x) {
            System.out.println("min number is " +z);
        }
    }

}
