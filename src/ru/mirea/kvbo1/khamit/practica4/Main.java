package ru.mirea.kvbo1.khamit.practica4;

public class Main {
    public static void best_season(Sesons s) {
        switch (s) {
            case Autumn -> System.out.println("Я люблю осень");
            case Spring -> System.out.println("Я люблю весну");
            case Summer -> System.out.println("Я люблю лето");
            case Winter -> System.out.println("Я люблю зиму");

        }

    }

    public static void main(String[] args) {
       Sesons[] a=Sesons.values();
       for(Sesons i:a){
           System.out.println(i + " " + i.getTemp());
           i.getDescription();
       }

    }
}
