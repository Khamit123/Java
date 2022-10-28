package ru.mirea.kvbo1.khamit.practica20;

public class MinMax <N extends Number>{
    private N[] arr;
    public MinMax(N[]a){
        arr=a;
    }

    public N searchMin(){
        N min=arr[0];
        for(int k=1;k<arr.length;k++){
            if(min.doubleValue()>arr[k].doubleValue()){
                min=arr[k];
            }
            }

        return min;
    }
    public N searchMax(){
        N max=arr[0];
        for(int k=1;k<arr.length;k++){
            if(max.doubleValue()<arr[k].doubleValue()){
                max=arr[k];
            }
        }

        return max;
    }
}
