package btu.project1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ClassA firstclass = new ClassA();
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        firstclass.firstmethod(x,y);
//        firstclass.secondmethod(x,y);
//        System.out.println(firstclass.thirdmethod(x,y));

//        ClassB scndclass = new ClassB();
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//        scndclass.firstmethod(x,y,z);
//        scndclass.scndmethod(x,y,z);
//        System.out.println();
//        scndclass.thirdmethod(x,y,z);

        ClassC thirdClass = new ClassC();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        thirdClass.firstmethod(x,y,z);
        System.out.print(thirdClass.lastnumber());
        System.out.println();
        System.out.print(thirdClass.firstnumber());
        System.out.println();
        thirdClass.sumofdigits();
        System.out.println();
        thirdClass.mult();
        System.out.println();
        thirdClass.sum();
    }
}
