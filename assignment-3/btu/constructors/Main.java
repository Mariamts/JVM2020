package btu.constructors;

public class Main {
    public static void main(String[] args) {
        ClassA firstclass = new ClassA();
        firstclass.method();

        ClassB scndclass = new ClassB(8);
        scndclass.method();

        ClassC thirdclass = new ClassC(6,10,9);
        thirdclass.firstmethod();

        ClassD classd = new ClassD();
        classd.firstmethod();
        System.out.println();
        classd.scndmethod();
        System.out.println();

        ClassF classf = new ClassF(5,8);
        classf.method1();
        System.out.println();
        classf.method2();
        System.out.println();

        ClassG classg = new ClassG(3,2);
        classg.method1();
        System.out.println();
        classg.method2();

    }
}
