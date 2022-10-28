package ru.mirea.kvbo1.khamit.practica23;

public class MyQueue {
    private int size;
    private int front;
    private int rear;
    private int [] queuee;
    MyQueue(int size){
        this.size=size;
        queuee=new int[size];
        front=-1;
        rear=-1;
    }
    MyQueue(){
        this.size=5;
        queuee=new int[size];
        front=-1;
        rear=-1;
    }

    public boolean isFull(){
        if(rear==size-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }
    public void insert(int y){
        if(!isFull()){
            if(front==-1){
                front=0;
            }
            rear+=1;
            queuee[rear]=y;
        }
    }
    public int delete(){
        if(isEmpty()) {
            System.out.println("Очередь пуста");
            return -1;
        }
        if(rear==front) {
            rear=-1;
            front=-1;

        }
        else{
            front++;
        }
        return queuee[front-1];
    }
    public  void peek(){
        if(isEmpty()){
            System.out.println("Очередь пуста");
            return;
        }
        System.out.println(queuee[front]);

    }
}
