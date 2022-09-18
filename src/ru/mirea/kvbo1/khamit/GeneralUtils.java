package ru.mirea.kvbo1.khamit;

public class GeneralUtils {
    public static void sort(double[] a) {
        for (int k = 0; k < a.length - 1; k++) {
            for (int k1 = 0; k1 < a.length - 1 - k; k1++) {
                if (a[k1] > a[k1 + 1]) {
                    double r = a[k1];
                    a[k1] = a[k1 + 1];
                    a[k1 + 1] = r;
                }
            }
        }
    }
    public static void sort(int[] a) {
        for (int k = 0; k < a.length - 1; k++) {
            for (int k1 = 0; k1 < a.length - 1 - k; k1++) {
                if (a[k1] > a[k1 + 1]) {
                    int r = a[k1];
                    a[k1] = a[k1 + 1];
                    a[k1 + 1] = r;
                }
            }
        }
    }
}
