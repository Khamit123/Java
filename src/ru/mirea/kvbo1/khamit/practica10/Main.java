package ru.mirea.kvbo1.khamit.practica10;

import ru.mirea.kvbo1.khamit.GeneralUtils;

import java.util.Comparator;
import java.util.Random;

public class Main {
    Random rand = new Random();

    public static void setArray(Student1[] a) {
        Random rand = new Random();
        for (int k=0;k<a.length;k++) {
            a[k]=new Student1(rand.nextInt(-5,5));

        }
    }


    static int partition(Student1[] arr, int low, int high) {

        Comparator<Student1> comp = new StudentScoreComparator().thenComparing(new StudentNameComparator());
        Student1 pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (comp.compare(arr[j], pivot) == -1) {
                i++;
                GeneralUtils.swap(arr, i, j);
            }
        }
        GeneralUtils.swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickStudentSort(Student1[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickStudentSort(arr, low, pi - 1);
            quickStudentSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Student1[] iDNumber = new Student1[10];
        setArray(iDNumber);
        GeneralUtils.printArr(iDNumber);
        System.out.println();
        quickStudentSort(iDNumber,0,9);
        GeneralUtils.printArr(iDNumber);
    }
}

