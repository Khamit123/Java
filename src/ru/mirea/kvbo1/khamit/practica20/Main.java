package ru.mirea.kvbo1.khamit.practica20;

import java.util.Random;

public  class Main {
    public static void main(String[] args) {
        Random rand=new Random();
        Integer[]arr=new Integer[10];
        for(int k=0;k<10;k++){
            arr[k]= rand.nextInt(1,150);
        }
        int n=2;
        int a=arr[n--];
        System.out.println(a+" "+arr[2]+" "+arr[1]);
MinMax<Integer> m=new MinMax<>(arr);
        System.out.println( Calculator.sum(arr[1],arr[2]));
        System.out.println(m.searchMin());
        System.out.println(m.searchMax());
        int[][]u={{2,3},{4,5}};
        int[][]u1={{23,33},{43,53}};
        IntegerMatrix at=new IntegerMatrix(u);
        IntegerMatrix at1=new IntegerMatrix(u1);
        Number[][] n1=at.addMatrix(at1);
        System.out.println(n1[1][1]);

    }
}
