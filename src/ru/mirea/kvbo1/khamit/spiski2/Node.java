package ru.mirea.kvbo1.khamit.spiski2;

public class Node<E> {
    E data;
    Node next;
    Node prev;
    public Node(E dataValue){
        next = null;
        data = dataValue;
        prev=null;
    }
    public Node(E dataValue, Node nextValue, Node prevValue){
        next = nextValue;
        data = dataValue;
        prev=prevValue;
    }

    public Node(E dataValue, Node nextValue){
        next = nextValue;
        data = dataValue;
    }
    public E getData() { return data; }
    public void setData(E dataValue) {
        data = dataValue;
    }
    public Node<E> getPrev(){return prev;}
    public Node<E> getNext() { return next; }
    public void setNext(Node<E> nextValue) { next = nextValue; }
    public void setPrev(Node<E> prevValue){prev=prevValue;}
    @Override
    public String toString() {
        String output ="";
        output = "node data="+data;
        return output;
    }
}
