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
class MyTwoLinkedList<E> {
    private Node<E> tail;
    private Node<E> head;
    private int listCount;

    public int getListCount() {
        return listCount;
    }

    public MyTwoLinkedList() {
        head = new Node(null);
        tail = head;
        listCount = 0;
    }
    public void add(E data){
        Node<E> tmp = new Node<E>(data);
        Node<E> current = tail;
        tail.setNext(tmp);
        tail=tail.getNext();
        tail.setPrev(current);
        listCount++;
    }
    public void add(E data, int index){
        Node<E> tmp = new Node<E>(data);
        Node<E> current = head;
        for (int i=1; i<index && current.getNext() != null; i++){
            current = current.getNext();
        }
        tmp.setNext(current.getNext());
        current.setNext(tmp);
        tmp.setPrev(current);
        listCount++;
    }
    public E get(int index){
        if (index <= 0 || index>listCount) return null;
        Node<E> current = head.getNext();
        for (int i = 1; i < index; i++){
            if (current.getNext() == null) return null;
            current = current.getNext();
        }
        return current.getData();
    }
    public boolean remove(int index) throws EmptyListException {
        if (index < 1 || index > size()) {
            throw new EmptyListException();
        }
        Node<E> current = head;
        for (int i =1; i < index; i++){
            if (current.getNext() == null) return false;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
    return true;
    }
    public int size(){ return listCount; }
    @Override
    public String toString() {
        Node<E> current = head.getNext();
        String output = "";
        while (current != null){
            output+="["+current.getData().toString()+"]";
            current = current.getNext(); }
        return output;
    }
}