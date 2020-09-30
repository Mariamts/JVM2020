package btu.constructors;

public class ClassB {
    public int x;

    public ClassB() {}
    public ClassB(int var) {
        this.x = var;
    }

    public void method() {
        if( x > 5 && x < 24) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }
}
