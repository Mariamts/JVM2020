package btu.inheritance;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ClassA firstclass = new ClassA();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        firstclass.method1(x);
        firstclass.x(5);
        firstclass.checker(6);

        ClassB childclass = new ClassB();
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        childclass.method1(5);
        childclass.sum(1,2);
    }

}
