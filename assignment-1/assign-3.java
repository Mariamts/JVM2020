import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Enter first number");

        Scanner scnd = new Scanner(System.in);
        System.out.println("Enter scnd number");

        Scanner third = new Scanner(System.in);
        System.out.println("Enter third number");

        int firstNum = first.nextInt();
        int scndNum = scnd.nextInt();
        int thirdNum = third.nextInt();
        int sum = firstNum + scndNum + thirdNum ;
        int multiplication = firstNum * scndNum * thirdNum;
        System.out.println("Sum of them is" +" " + sum +" " + "multiplication is equal to" + multiplication );
    }
}