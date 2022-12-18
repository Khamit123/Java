package ru.mirea.kvbo1.khamit.automat;

import ru.mirea.kvbo1.khamit.GeneralsUtil.GeneralUtils;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String data = sc.next();
        String data="Персональные данные переданы";
        char[] data1=data.toCharArray();
        String obraz="данные";
        char[] obraz1=obraz.toCharArray();
        int n=obraz.length();
        int[]d=new int[n+1];
        for(int k=0;k<n;k++){
            if(k==n-1){
                d[k]=n;
            }
            else {
                d[k]=obraz1.length-k-1;
            }
        }
        boolean p=true;
        int u=n;
        int u1=n;
        int u2=n;
        while(p){
            if(obraz1[u-1]==data1[u1-1]){
                u--;
                u1--;
                if(u==0){
                    p=false;
                    System.out.println(u1);
                    break;
                }
            }
            if((obraz1[u-1]!=data1[u1-1])){
                for(int k=n-1;k>=-1;k--){
                    if(k==-1){
                        u=n;
                        u2+=n;
                        u1=u2;
                        break;
                    }
                    if(data1[u1-1]==obraz1[k]){
                        u=n;
                        u2+=d[k];
                        u1=u2;
                        break;
                    }
                }

            }

        }
        System.out.println(data1[13]);
    }
}
