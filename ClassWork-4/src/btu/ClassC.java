package btu;

import java.util.Scanner;

public class ClassC {
    public int a = 10;
    public int b = 9;
    public char s = '#';
    public char h = '@';

    public void first() {
        System.out.print(this.a + "  " +this.b);
    }
    public void scnd() {
        System.out.print(this.s + "  " +this.h);
    }

    public void third() {
        System.out.print(this.a + this.b);
        System.out.println();
        System.out.print(this.a - this.b);
        System.out.println();
        System.out.print(this.a * this.b);
        System.out.println();
        System.out.print(this.a % this.b);
    }

    public void a() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a:");
        this.a = scan.nextInt();
    }

    public void b() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter b:");
        this.b = scan.nextInt();
    }

    public void symb() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter s and h:");
        this.s = scan.nextLine().charAt(0);
        this.h = scan.nextLine().charAt(0);
    }
}
