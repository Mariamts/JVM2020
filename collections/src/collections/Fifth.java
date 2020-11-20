package collections;

import java.util.ArrayList;
import java.util.Random;

public class Fifth {
    public void davaleba5() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            arrayList.add(rand.nextInt(25));
        }
        System.out.println("my list with 5 elements : " + arrayList);

        for( int m =0; m < 3; m++) {
            Random rand = new Random();
            arrayList.add(rand.nextInt(50));
        }
        System.out.println("my list with +3 elements : " + arrayList);
    }
}
