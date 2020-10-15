package btu;

public class ClassA {
    public int a = 10;
    public int b = 29;


    public void first() {
        System.out.println("hello oop");
    }

    public void scnd() {
        System.out.print(this.a);
    }

    public void third() {
        System.out.print(this.b);
    }

    public void forth() {
        System.out.print(this.a + this.b);
    }

    public int fifth() {
       return (this.a + this.b);
    }

    public int sixth() {
        return (this.a * this.b);
    }

    public void seventh() {
        this.a = 5;
        this.b = 6;

        System.out.print(this.a);
        System.out.println();
        System.out.print(this.b);
    }
}
