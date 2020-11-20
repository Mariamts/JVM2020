package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Forth {
    public void davaleba4() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            arrayList.add(rand.nextInt(100));
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        System.out.println(" reversed sorted array: " +arrayList);
    }
}
