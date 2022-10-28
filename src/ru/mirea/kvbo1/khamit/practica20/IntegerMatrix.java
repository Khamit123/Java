package ru.mirea.kvbo1.khamit.practica20;

import java.util.Arrays;

public class IntegerMatrix extends Matrix<Integer> {
    public IntegerMatrix(int [][] y){
        Integer [][]a=new Integer[y.length][y[0].length];
        for(int k=0;k<y.length;k++){
            for(int yt=0;yt<y[0].length;yt++){
                a[k][yt]=y[k][yt];
            }
        }
        arr=a;
    }
    protected Integer add(Integer o1, Integer o2) {
        return o1 + o2;
    }

    protected Integer multiply(Integer o1, Integer o2) {
        return o1 * o2;
    }

    protected Integer zero() {
        return 0;
    }

    @Override
    public String toString() {
        return "IntegerMatrix{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}