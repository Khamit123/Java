package ru.mirea.kvbo1.khamit.practica9;

public class SortingStudentsByGPA {
public static void Sort(Comparable[] list ){
    for(int k=0;k<list.length-1;k++){
        for(int k1=0;k1<list.length-k-1;k1++){
      if(list[k1].compareTo(list[k1+1])==1)  {
        Comparable t =list[k1];
        list[k1]=list[k1+1];
        list[k1+1]=t;
      }
    }
}
}
}

