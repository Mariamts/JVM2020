package collections;

import java.util.ArrayList;
import java.util.Random;

public class First {
    public void davaleba1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            arrayList.add(rand.nextInt(100));
        }
        System.out.println("my list is : " + arrayList);
    }
}
