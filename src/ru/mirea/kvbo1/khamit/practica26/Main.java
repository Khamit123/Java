package ru.mirea.kvbo1.khamit.practica26;


import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            st.add(i);
        }
        Iterator<Integer> itr = st.iterator();
        itr.next();
        inv(st);
        System.out.println(st.toString());
        MyTwoLinkedList<Integer> a= new MyTwoLinkedList<>();
        a.add(12);
        Iterator b= a.iterator();
        b.next();
        b.next();

    }
    static void inv(Stack<Integer> st) {
        for (int k = 0; k < st.size() / 2; k++) {
            int first = st.get(k);
            int last = st.get(st.size() - k - 1);
            st.removeElementAt(k);
            st.removeElementAt(st.size() - k - 1);
            st.add(k, last);
            st.add(st.size() - k, first);
        }
    }
}