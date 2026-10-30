package au.edu.rmit.sept;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] a = {7, 2, 76, 4, 99};
        int n = a.length;
        for ( int i = 0; i < n - 1; i ++ ) {
            boolean swapped = false;
            for ( int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("After pass " + i + ": " + Arrays.toString(a));
            if (!swapped) {
                break;
            }
        }
    }
}
