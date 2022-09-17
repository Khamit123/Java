package ru.mirea.kvbo1.khamit;

import java.lang.System;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static int fact(int a) {
        System.out.format("sdad", a);

        return 0;
    }

    public static void main(String[] args) {
        fact(2);
        System.out.println("Hello world");
        Circle c = new Circle(4.5);
        c.setRadius(3);
        System.out.println(c.squar());
        System.out.println(c);
        int[] mass = {2, 6, 1, 5, 3, 2, 6, 23, 6, 3};
        double sum = 0;
        for (int k = 0; k < mass.length; k++) {
            sum += mass[k];
        }
        System.out.println(sum + " " + sum / (mass.length));

        int[] mass1=new int[10];
        Scanner sc = new Scanner(System.in);
        int y=0;
        int sum1=0;
        int max=0;
        int min=100000;
         while (y!=10) {
            mass1[y] = sc.nextInt();
            sum1 += mass1[y];
            if(max<mass1[y]){
                max=mass1[y];
            }
            if(min>mass1[y]){
                min=mass1[y];
            }
            y += 1;
        }
        System.out.println(max +" "+ min+ " "+ sum1);
        for(double i=0;i<10;i++){
            double a=1/(i+1);
            System.out.format("%.3f%n",a);
        }
        Author a=new Author("Bob","bob123@mail.ru",'M');
        System.out.println(a);

        Random rand= new Random();
        double[] mass3=new double[10];
        for(int k=0;k<10;k++){
            mass3[k]=Math.random();
            System.out.format("%.3f%n",mass3[k]);
        }
        System.out.println(Integer.parseInt("12423"));

Circle1 c2=new Circle1("red",true,4);
        System.out.println(c2.getArea());


    }




}
