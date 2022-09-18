package ru.mirea.kvbo1.khamit.practica3;

import ru.mirea.kvbo1.khamit.GeneralUtils;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Math и Random
        Random rand = new Random();
        double[] mass3 = new double[10];
        for (int k = 0; k < 10; k++) {
            mass3[k] = Math.random();
            System.out.format("%.3f%n", mass3[k]);
        }
        for (int k = 0; k < 10; k++) {
            mass3[k] = rand.nextFloat(100);
            System.out.format("%.3f%n", mass3[k]);
        }
        GeneralUtils.sort(mass3);
        System.out.println(Arrays.toString(mass3));


        //Классы оболочки

        Double d = Double.valueOf(3.14);
        double r = Double.parseDouble("2.31");
        int i = d.intValue();
        String w = d.toString();
        byte v = d.byteValue();
        System.out.println(r + " " + d + " "+ i);
    }
}
