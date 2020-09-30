package btu.constructors;

public class ClassF {
    public float x;
    public float y;

    public  ClassF() {}
    public  ClassF(float var1, float var2) {
        this.x = var1;
        this.y = var2;
    }

    public void method1() {
        if ( x == 0) {
            System.out.println("something is missing");
        }
    }

    public void method2() {
        if ( x > y) {
            System.out.print(y);
        } else {
            System.out.print(x);
        }
    }


}
