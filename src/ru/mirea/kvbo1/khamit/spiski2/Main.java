package ru.mirea.kvbo1.khamit.spiski2;

public class Main {
    public static void main(String[] args) {

        MyTwoLinkedList n = new MyTwoLinkedList();
        n.add(2);
        n.add(5);
        n.add(3);
        n.add(1);
        n.add(10);
        n.add(7);
        System.out.println(n.get(1));
        for (int y = 1; y < n.getListCount()+1; y++) {
            int index = y;
            int a=0;
            Object temp = n.get(y);
            a = (int) temp;
            for (int k = y; k < n.getListCount()+1
                    ; k++) {
                if ((int) n.get(k) < a) {
                    a = (int) n.get(k);
                    index = k;
                }
            }
            n.remove(index);
            n.add(a,1);
        }

        System.out.println(n);
    }
}
