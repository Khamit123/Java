package ru.mirea.kvbo1.khamit.practica1;

import java.lang.System;
import java.util.Scanner;

public class Main {
    static int fact(int a) {
        int proiz = 1;
        for (int k = 2; k <= a; k++) {
            proiz *= k;
        }

        return proiz;
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве а потом и сам массив");
        n = sc.nextInt();
        System.out.print("\n");
        int[] mass = new int[n];

        int sum = 0;
        for (int k = 0; k < mass.length; k++) {
            mass[k] = sc.nextInt();
            sum += mass[k];
        }
        System.out.print("Сумма всех элементов масива равна " + sum + "\n Среднее арифметическое массива " );
        double sa=sum;
        System.out.format("%.3f%n",sa/mass.length);
        System.out.println("Первые 10 чисел гармонического ряда ");
        for (double i = 1; i <= 10; i++) {
            System.out.format("%.3f%n", 1 / i);
        }
        System.out.println("Факториал 4 = " + fact(4));
    }
}
