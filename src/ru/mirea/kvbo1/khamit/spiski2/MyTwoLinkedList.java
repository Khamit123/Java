package ru.mirea.kvbo1.khamit.spiski2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyTwoLinkedList<E> implements Iterable {
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

    public void add(E data) {
        Node<E> tmp = new Node<E>(data);
        Node<E> current = tail;
        tail.setNext(tmp);
        tail = tail.getNext();
        tail.setPrev(current);
        listCount++;
    }

    public void add(E data, int index) {
        Node<E> tmp = new Node<E>(data);
        Node<E> current = head;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        tmp.setNext(current.getNext());
        current.setNext(tmp);
        tmp.setPrev(current);
        listCount++;
    }

    public E get(int index) {
        if (index <= 0 || index > listCount) return null;
        Node<E> current = head.getNext();
        for (int i = 1; i < index; i++) {
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
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) return false;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }

    public int size() {
        return listCount;
    }

    @Override
    public String toString() {
        Node<E> current = head.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                if (current.getNext() != null) {
                    return true;
                } else return false;
            }

            @Override
            public Node next() {
                if (hasNext()) {
                    current = current.getNext();
                    return current;
                } else throw new NoSuchElementException();
            }
        };
    }
}
