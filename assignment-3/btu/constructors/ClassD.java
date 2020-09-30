package btu.constructors;

public class ClassD {
    public int x = 5;
    public int y= 9;

    public ClassD(){
        System.out.println("hello my class");
    }

    public void firstmethod() {
        if( x > 0) {
            System.out.print(4*(x-y));
        }
        if (x == 0) {
            System.out.print(2*(x+y));
        }
    }

    public void scndmethod() {
        if( y > 0) {
            System.out.print(4*(x-y));
        }
        if (y == 0) {
            System.out.print(2*(x+y));
        }
    }

}
