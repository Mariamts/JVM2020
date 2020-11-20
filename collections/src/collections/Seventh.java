package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Seventh {
    public void davaleba7() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            arrayList.add(rand.nextInt(25));
        }
        System.out.println("list with all elements : " + arrayList);


        arrayList.remove(0);
        arrayList.remove(0);
        arrayList.remove(0);
        System.out.println("list with removed items : " + arrayList);

    }
}

