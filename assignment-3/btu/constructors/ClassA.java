package btu.constructors;

public class ClassA {
    int x = 26;

    public ClassA() {
        System.out.println("heello world");
    }

    public void method() {
        if ( x % 2 == 0) {
            System.out.println("X is even");
        } else {
            System.out.println("X is odd");
        }
    }
}
