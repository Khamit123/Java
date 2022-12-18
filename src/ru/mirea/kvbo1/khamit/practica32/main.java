package ru.mirea.kvbo1.khamit.practica32;

import ru.mirea.kvbo1.khamit.GeneralsUtil.GeneralUtils;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static int[] mobile(int[] a, int[] b) {
        int[] max = {0, 0};
        for (int k = 0; k < a.length; k++) {
            if (a[k] > max[0]) {
                if (b[k] == 0 && k == 0) {
                    continue;
                }
                if (b[k] == 1 && k == a.length - 1) {
                    continue;
                }
                if (b[k] == 0) {
                    if (a[k] > a[k - 1]) {
                        max[0] = a[k];
                        max[1] = k;
                    }
                } else {
                    if (a[k] > a[k + 1]) {
                        max[0] = a[k];
                        max[1] = k;
                    }
                }
            }
        }
        return max;
    }

    public static int change(int a) {
    if(a==1)return 0;
    if(a==0)return 1;
    return 1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        int[] pointers = new int[n];
        for (int k = 1; k <= n; k++) {
            number[k - 1] = k;
            pointers[k - 1] = 0;
        }
        GeneralUtils.printArr(number);
        System.out.println();
        while (mobile(number, pointers)[0] > 0) {
            int a1 = mobile(number, pointers)[1];
            int current=number[a1];
            if (pointers[a1] == 0) {
                GeneralUtils.swap(number, a1, a1 - 1);
                GeneralUtils.swap(pointers, a1, a1 - 1);
                GeneralUtils.printArr(number);
                System.out.println();
            } else if (pointers[a1] == 1) {
                GeneralUtils.swap(number, a1, a1 + 1);
                GeneralUtils.swap(pointers, a1, a1 + 1);
                GeneralUtils.printArr(number);
                System.out.println();
            }

            for (int i = 0; i < n; i++) {
                if (number[i] > current) {
                    pointers[i]=change(pointers[i]);
                }
            }
        }
    }
}
