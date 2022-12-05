package ru.mirea.kvbo1.khamit.practica29;

import java.util.Scanner;

public class Main {
    private static final int INF = 1000 * 1000 * 1000;

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[][] g = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                g[i][j] = scanner.nextInt();

            }
        }
        int count=0;
   for(int k=0;k<length;k++) {
       for (int i = k; i < length; i++) {
           if (g[k][i] == 1) {
               count += 1;
           }
       }
   }
        System.out.println(count);
    }
}
