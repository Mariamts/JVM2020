package collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Eight {
    public void davaleba8() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            arrayList.add(rand.nextInt(100));
        }
        System.out.println("my list is : " + arrayList);
        System.out.print("Enter Element to be deleted : ");
        int elem = in.nextInt();

        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) == elem){
                    arrayList.remove(i);
                break;
            }
        }

        System.out.println("modified list : " );
        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(" " + arrayList.get(i));
        }

    }
}
