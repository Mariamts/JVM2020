package homework7;

import java.util.Scanner;

public class Third {
    public int multiply() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        while (number > 0) {
            int num = number % 10;
            reverse = (reverse * 10) + num;
            number  /= 10;
        }
        return reverse * 2;
    }
}