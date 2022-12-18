package ru.mirea.kvbo1.khamit.practica28;

import java.util.Hashtable;
import java.util.Random;

public class Map {
    int nameCount=0;
    int lastNameCount=0;
    public  Hashtable<String, String> createMap() {
        Random rand = new Random();
        Hashtable<String, String> a = new Hashtable<>();


        for (int i = 0; i < 10; i++) {
            String b = "";
            String s = "";
            for (int k = 0; k < 2; k++) {
                char f = (char) rand.nextInt(97, 100);
                char f1 = (char) rand.nextInt(97, 100);
                b += f;
                s += f1;
            }
            if(a.containsKey(b)){
                lastNameCount+=1;
            }
            if(a.containsValue(s)){
                nameCount+=1;
            }
            a.put(b,s);
        }
        return a;
    }
    public int getSameFirstName(){
        return nameCount;
    }
    public int getSameLastName(){
        return lastNameCount;
    }
}
