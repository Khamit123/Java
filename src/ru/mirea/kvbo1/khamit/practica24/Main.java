package ru.mirea.kvbo1.khamit.practica24;

public class Main {
    public static void main(String[] args) {


        ChairFactory creater = new ChairFactory();
        Chair chair = creater.createVictoriaChair(2);
        Client a = new Client();
        a.setChair(chair);
        a.sit();

    }
}