package ru.mirea.kvbo1.khamit.practica2;

import ru.mirea.kvbo1.khamit.GeneralUtils;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void swap(double a,double b){
        double r=a;
        a=b;
        b=r;
    }
    public static void main(String[] args) {
        Author Misha = new Author("Misha", "Misha@gmail.com", 'M');
        System.out.println(Misha);
        Shop mall = new Shop();
        Computer f = new Computer(true, true, false);
        mall.add(f);
        mall.add(f);
        mall.shop_list();
        mall.delete(f);
        mall.shop_list();

    }
}
