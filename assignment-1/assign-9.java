public class Main {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++ ) {
            System.out.print(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i > max) {
                max = arr[i];
            }
            if ( i < min) {
                min = arr[i];
            }
        }
        System.out.print("  " + "smalesst" + min);
        System.out.print("  " + "biggest" + max);
    }
}