package btu.project1;

public class ClassA {
    public int b;
    public int a;

    public void firstmethod( int x, int y) {
        a = x;
        b = y;
    }

    public void secondmethod (int x, int y) {
        int sum = x+y;
        System.out.println(sum);
    }

    public int thirdmethod (int x, int y) {
        int  mult = x*y;
        return mult;
    }
}
