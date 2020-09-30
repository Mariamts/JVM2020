package btu.project1;

public class ClassC {
    public  int a ;
    public  int b ;
    public  int c ;

    public void firstmethod(int x, int y, int z) {
        a=x;
        b=y;
        c=z;
    }

    public int lastnumber() {
        int var = a %10;
        return var;
    }

    public int firstnumber() {
        int frstnum = Integer.parseInt(Integer.toString(b).substring(0, 1));
        return frstnum;
    }

    public void sumofdigits() {
        int sum = 0;
        while (c != 0)
        {
            sum = sum + c % 10;
            c = c/10;
        }
        System.out.print(sum);
    }

    public void mult() {
        System.out.print(lastnumber() * firstnumber());
    }

    public void sum() {
        System.out.print(lastnumber() * firstnumber());
    }
}
