package btu.inheritance;

public class ClassA {

    public int a;

    public ClassA() {
        System.out.println("Hello my a class !");
    }

    public void method1(int x) {
        a= x;
    }

    public void x(int x) {
        System.out.print(x);
    }

    public void checker(int x ) {
        if (x % 2 ==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}
