package ru.mirea.kvbo1.khamit.spiski2;

public class EmptyListException extends RuntimeException {
    public EmptyListException(String errmessage){
        super(errmessage);
    }
    public EmptyListException(){
    }
}
