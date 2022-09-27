package ru.mirea.kvbo1.khamit;

public class Main {
    public static int without20(int a, int b) {
        return recursion9(a, b, 0) + recursion9(a, b, 1);
    }

    public static int recursion9(int a, int b, int n) {
        if (a != 0 && b != 0) {
            if (n == 0) {
                return recursion9(a - 1, b, 1);
            } else if (n == 1) {
                return recursion9(a, b - 1, 0) + recursion9(a, b - 1, 1);
            }
        } else if (a == 0) {
            return 1;
        } else if (a > 1) {
            return 0;
        } else if (a == 1 && n == 1) {

            return 1;
        }
        return 0;
    }

    public static void recursion1(int n) {
        if (n > 1) {
            recursion1(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(", " + n);
            }
        } else if (n == 1) {
            System.out.print(1);

        }

    }

    public static int recursion5(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return recursion5(n / 10) + n % 10;
    }
}