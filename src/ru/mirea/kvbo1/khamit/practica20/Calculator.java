package ru.mirea.kvbo1.khamit.practica20;

public class Calculator {
    public static <T extends Number,V extends Number> Number sum (T a,V b){
       return a.doubleValue()+b.doubleValue();
    }
    public static <T extends Number,V extends Number> Number multiply (T a,V b){
        return a.doubleValue()*b.doubleValue();
    }
    public static <T extends Number,V extends Number> Number divide (T a,V b){
        return a.doubleValue()/b.doubleValue();
    }
    public static <T extends Number,V extends Number> Number substraction (T a,V b){
        return a.doubleValue()-b.doubleValue();
    }
}
