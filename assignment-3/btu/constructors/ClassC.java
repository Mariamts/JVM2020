package btu.constructors;

public class ClassC {
    public int a;
    public int b;
    public int x;

    public ClassC() {}
    public ClassC(int var1, int var2, int var3) {
        this.a = var1;
        this.b = var2;
        this.x = var3;
    }

    public void firstmethod() {
        if(b > a){
            System.out.println("true");
        }
        if ( x > a && x < b) {
            System.out.println("second condition is true as well");
        }
    }

}
