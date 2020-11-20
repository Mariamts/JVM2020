package collections;

import java.util.ArrayList;
import java.util.Random;

public class Scnd {
    public void davaleba2() {
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            arrayList2.add(rand.nextInt(100));
        }

        System.out.println("pirdapiri rigi: " + arrayList2);

        System.out.print("shebrunebuli rigi:");
        for (int i = arrayList2.size() - 1; i >= 0; i--) {
            System.out.print(arrayList2.get(i) + ", ");
        }
        }

    }
