package ru.mirea.kvbo1.khamit.GeneralsUtil;
import java.util.Random;

import ru.mirea.kvbo1.khamit.practica10.Student1;

public class GeneralUtils {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                GeneralUtils.swap(arr, i, j);
            }
        }
        GeneralUtils.swap(arr, i + 1, high);
        return (i + 1);
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void printArr(int []a){
        for(int k=0;k<a.length;k++){
            System.out.print(a[k] + " ");
        }
    }
    public static void printArr(Student1 []a){
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swap(Student1[] arr, int i, int j) {
        Student1 temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swap1(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(double[] a) {
        for (int k = 0; k < a.length - 1; k++) {
            for (int k1 = 0; k1 < a.length - 1 - k; k1++) {
                if (a[k1] > a[k1 + 1]) {
                    swap1(a,k1,k1+1);
                }
            }
        }
    }
    public static void sort(int[] a) {
        for (int k = 0; k < a.length - 1; k++) {
            for (int k1 = 0; k1 < a.length - 1 - k; k1++) {
                if (a[k1] > a[k1 + 1]) {
                    swap(a,k1,k1+1);
                }
            }
        }
    }
public static void fillArr(int[] a){
        for (int k=0;k<a.length;k++){
            Random rand =new Random();
            a[k]= rand.nextInt(10000,99999);
        }
}
public static boolean searchInArr(int []arr,int isk){
        for(int i :arr){
            if (isk==i){
                return true;
            }
        }
        return false;
}
    public static void printArr2(Integer [][]a){
        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < a[0].length; i++) {
                System.out.print(a[k][i]);
            }
            System.out.println();
        }
        System.out.println();
    }
    }



