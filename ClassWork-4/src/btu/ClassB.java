package btu;

import java.util.Scanner;

public class ClassB {
    public int a =33;
    public double b = 9.7;
    public char s = '#';

    public void first() {
        System.out.print(this.s);
    }

    public void scnd() {
        System.out.print(this.a);
    }

    public void third() {
        System.out.print(this.b);
    }

    public void minus() {
        System.out.print(this.a - this.b);
    }

    public double div() {
        return (this.a / this.b);
    }

    public void sixth() {
        System.out.print(this.a = 7);
        System.out.println();
        System.out.print(this.b = 7.9);
        System.out.println();
        System.out.print(this.s = '$');
    }

    public void seventh() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a:");
        this.a = scan.nextInt();
    }

    public void eigth() {
        System.out.print(this.b + 10);
    }
}
