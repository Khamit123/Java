package ru.mirea.kvbo1.khamit.practica30;

import java.util.Random;
public class Mainp2 {
    public static void main(String[] args) {
        Random rand =new Random();
        Tree tre=new Tree();
        for(int i=0; i<10;i++) {
            tre.add(new Node(rand.nextInt(1,5), null));
        }
        tre.print();
        System.out.println();
        tre.delete(2);
        tre.print();
    }
}
