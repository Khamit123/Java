package ru.mirea.kvbo1.khamit.automat;

import ru.mirea.kvbo1.khamit.GeneralsUtil.GeneralUtils;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String data = sc.next();
        String data="Персональныев пере переданы";
        char[] data1=data.toCharArray();
        String obraz="пере";
        int n=obraz.length();
        String result = new StringBuilder(obraz).reverse().toString();
        String result1 = result.replaceAll("(.)(?=.*\\1)", "");
        result = result.replaceAll("(.)(?=.*\\1)", "@");
        result = new StringBuilder(result).reverse().toString();
        result1 = new StringBuilder(result1).reverse().toString();
        char[] result11=result1.toCharArray();
        int j=result.length()-result1.length();

        StringBuilder b=new StringBuilder(result);

        char[] obraz1=result.toCharArray();
        int[]d=new int[result.length()-j];
        for(int k=0;k<d.length;k++){
            if(k==n-1){
                d[k]=n;
            }
            else {
                d[k]=obraz1.length-k-1;
            }
        }
        char[] obraz3=result1.toCharArray();
        obraz1=obraz.toCharArray();
        boolean p=true;
        int u=n;
        int u1=n;
        int u2=n;
        char c=' ';
        while(p){
            if(obraz1[u-1]==data1[u1-1]){
                u--;
                u1--;
                c=obraz1[obraz.length()-1];
                if(u==0){
                    p=false;
                    System.out.println(u1);
                    break;
                }
            }
            if((obraz1[u-1]!=data1[u1-1])){
                if (c == ' ') {
                    for (int k = result.length() - j - 1; k >= -1; k--) {

                        if (k == -1) {
                            u = n;
                            u2 += n;
                            u1 = u2;
                            break;
                        }
                        if (data1[u1 - 1] == result11[k]) {
                            u = n;
                            u2 += d[k];
                            u1 = u2;
                            break;
                        }
                    }
                }
                    else if (c==obraz1[obraz.length()-1]){
                    for (int k = result.length() - j - 1; k >= -1; k--) {
                        if (c == result11[k]) {
                            u = n;
                            u2 += d[k];
                            u1 = u2;
                            break;
                        }
                    }
                    }
                }

            }

        }

    }

