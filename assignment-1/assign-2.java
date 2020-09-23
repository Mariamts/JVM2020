import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Enter first number");

        Scanner scnd = new Scanner(System.in);
        System.out.println("Enter scnd number");

        int firstNum = first.nextInt();
        int scndNum = scnd.nextInt();
        int result1 = firstNum / scndNum;
        int result2 = scndNum / firstNum;
        System.out.println(result1 + "and" + " " +  result2);
    }
}