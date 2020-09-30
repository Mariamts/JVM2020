package btu.constructors;

public class ClassG {
    public float x;
    public float y;

    public  ClassG() {}
    public  ClassG(float var1, float var2) {
        this.x = var1;
        this.y = var2;
    }

    public void method1() {
        int gcd = 1;

        for(int i = 1; i <= x && i <= y; ++i)
        {
            if(x % i==0 && y % i==0)
                gcd = i;
        }

        System.out.println( gcd);
    }

    public void method2() {
        int gcd = 1;

        for(int i = 1; i <= x && i <= y; ++i)
        {
            if(x % i==0 && y % i==0)
                gcd = i;
        }

        float lcm = (x * y)/gcd;

        System.out.print(lcm);
    }
}
