package ru.mirea.kvbo1.khamit.practica28;


import java.util.*;

public class main {

    public static void main(String[] args) {
        Random rand = new Random();
        HashSet<Integer> a = new HashSet<Integer>();
        Map f=new Map();
        for (int i = 0; i < 10; i++) {
            a.add(rand.nextInt(1, 100));
        }
        System.out.println(a);
        TreeSet<Integer> b = new TreeSet<Integer>(a);
        System.out.println(b);
        System.out.println(f.createMap());
    }
}
