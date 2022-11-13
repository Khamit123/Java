package ru.mirea.kvbo1.khamit.practica22;

public class EmptyStackExeption extends RuntimeException{
    EmptyStackExeption(String err){
        super(err);
    }
    EmptyStackExeption(){
        super();
    }
}
