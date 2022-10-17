package ru.mirea.kvbo1.khamit.practica8;

import ru.mirea.kvbo1.khamit.practica9.SortingStudentsByGPA;
import ru.mirea.kvbo1.khamit.practica9.Student;

import static java.lang.Math.sqrt;
public  class Main111 {
    static int sum = 0;

    public static int recursion4(int k, int s) {
        if (k == 0 & s == 0) {
            return 1;
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            s -= i;
            if (k != 0) {
                return recursion4(k - 1, s);
            }
            if (s == 0) {
                return sum += 1;
            }
            s += i;
        }
        return 1;
    }

    public static void recursion2(int n) {
        if (n > 1) {
            recursion2(n - 1);
        }
        System.out.println(n);
    }

    public static void recursion6(int n, int del) {
        if (del < sqrt(n)) {
            if (n % del == 0) {
                System.out.println("NO");
            } else recursion6(n, del + 1);
        } else System.out.println("YES");
    }

    public static int recursion61(int n, int del) {
        if (del < sqrt(n)) {
            if (n % del == 0) {
                return 0;
            } else return recursion61(n, del + 1);
        } else return 1;
    }

    public static void recursion7(int n, int del) {
        if (del == 1) {
            System.out.println(1);
            recursion7(n, del + 1);
        } else {
            if (n != 1) {
                if (recursion61(del, 2) == 1) {
                    while (n % del == 0) {
                        System.out.println(del);
                        n = n / del;
                    }
                }
                recursion7(n, del + 1);
            }
        }
    }

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

    public static void main(String[] args) {

        recursion1(10);
        System.out.println("\n" + recursion5(5264));
        System.out.println(without20(10, 12));
        recursion2(3);
        recursion6(4, 2);
        recursion7(1111, 1);
        System.out.println(recursion4(2, 6) + sum);
        Student[] o = new Student[5];
        for (int k = 0; k < 5; k++) {
            System.out.println(o[k]);
        }
        o[0] = new Student(5, "dasd1");
        o[1] = new Student(7, "dasd2");
        o[2] = new Student(5, "dasd3");
        o[3] = new Student(2, "dasd4");
        o[4] = new Student(1, "dasd5");
        SortingStudentsByGPA.Sort(o);
        for (int k = 0; k < 5; k++) {
            System.out.println(o[k]);
        }
        System.out.println(o.length);

    }
}
