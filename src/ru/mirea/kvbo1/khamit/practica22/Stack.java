package ru.mirea.kvbo1.khamit.practica22;
class Node<E>{
    private E data;
    private Node<E> next;
    private Node<E> prev;

    public Node() {
    }

    public Node(E data) {
        this.data = data;
        next=null;
        prev=null;
    }

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
        prev=null;
    }

    public Node(E data, Node<E> next, Node<E> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }
}
public class Stack<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public int getSize() {
        return size;
    }

    Stack(){
        head=new Node<E>(null);
        tail=head;
        size=0;
    }
    void push(E data){
        Node<E> cur=new Node<E>(data);
        Node<E> temp=tail;
        tail.setNext(cur);
        tail=tail.getNext();
        tail.setPrev(temp);
        size+=1;
    }
    E pop(){
        if(size==0){
            throw new EmptyStackExeption("Элемент не может быть удалён, так как стэк пуст");
        }
        tail=tail.getPrev();
        return tail.getNext().getData();

    }
    E top(){
        return tail.getData();
    }
}
