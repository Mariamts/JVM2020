import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String args[]) {
        int[] arr = new int[8];
        Random randNum = new Random();
        for (int i = 0; i < 8; i++) {
            arr[i] = randNum.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}