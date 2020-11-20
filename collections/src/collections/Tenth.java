package collections;

import java.util.ArrayList;
import java.util.Random;

public class Tenth {
    public void davaleba10() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            arrayList.add(rand.nextInt(100));
        }
        System.out.println("my list is : " + arrayList);

        for (int m = 0; m < arrayList.size(); m++) {
            if(arrayList.get(m) == 30) {
                arrayList.remove(m);
            }
        }
        System.out.println("list without 30-s :" + arrayList);
    }

}
