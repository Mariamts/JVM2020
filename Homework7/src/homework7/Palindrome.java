package homework7;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome() {
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        int result = 0;
        int clone = val;
        while (clone > 0) {
            int num = clone % 10;
            result = (result * 10) + num;
            clone /= 10;
        }
        return val == result;
    }
}
