package ru.mirea.kvbo1.khamit.practica30;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void sort(ArrayList<Node> array){
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = array.size() - 1; j > i; j--) {
                if (array.get(j - 1).compareTo(array.get(j))>0) {
                    Node tmp = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, tmp);
                }
            }
        }
    }
    public static void main(String[] args) {
        Random rand =new Random();
        TreeSet<Integer> b=new TreeSet<>();
        ArrayList<Node> v=new ArrayList<Node>(10);

        for(int i=0; i<10;i++) {
            v.add(new Node(rand.nextInt(1,20), null));
        }
        sort(v);
        Node tr =new Node(0,null);
        while(v.size()!=1) {
            tr=new Node(v.get(0).getData()+v.get(1).getData(),null,v.get(0),v.get(1));
            v.remove(0);
            v.remove(0);
            v.add(tr);
            sort(v);
        }
        Tree c=new Tree(tr);
        c.Hoffman();
    }
}
