package btu.project2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class ClassA {
    public int[] m = new int[10];

    public void ConsoleArray() {
        Scanner scanner = new Scanner(System.in);

        for ( int i = 0; i < m.length; i++) {
            m[i] = scanner.nextInt();
        }

        System.out.print(Arrays.toString(m));
    }

    public void random() {
        for(int i = 0; i < m.length; i++){
            m[i] = new Random().nextInt(16);
        }
        System.out.print(Arrays.toString(m));
    }

    public void Seven() {
        for(int i = 0; i < m.length; i++) {
            if(m[i] > 7) {
                System.out.print(m[i] + " index is " +i + "\n");
            }
        }
    }

    public void diff() {
        int max = m[0];
        int min = m[0];
        for (int i = 1; i < m.length; i++)
            if (m[i] > max) {
                max = m[i];
            }

        for (int i = 1; i < m.length; i++)
            if (m[i] < min) {
                min = m[i];
            }
        System.out.print(max - min);
    }
}
