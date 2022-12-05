package ru.mirea.kvbo1.khamit.practica27;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int hashtabHash(Map a){
        return a.hashCode();

    }
    public static void hashtabInit(Map a){
        a.clear();
    }
    public static void hashtabAdd (Map a,String key,int value){
        a.put(key, value);
    }
    public static int hashtabLookup(Map a, String key){
        return (int)a.get(key);
    }
    public static void hashtabDelete(Map a,String key){
        a.remove(key);
    }
    public static void main(String[] args) {
        Map map =new HashMap<>();
        for(int k=0;k<10;k++) {
            hashtabAdd(map, "dsad"+k, 5+k);
        }
        System.out.println(hashtabHash(map));
        System.out.println(map);
        hashtabDelete(map,"dsad0");
        System.out.println(map);
        System.out.println(hashtabLookup(map,"dsad1"));
    }
}
