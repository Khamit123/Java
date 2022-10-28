package ru.mirea.kvbo1.khamit.practica19;

import ru.mirea.kvbo1.khamit.GeneralUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int []INNarr=new int[10];
        GeneralUtils.fillArr(INNarr);
        GeneralUtils.printArr(INNarr);
        try{
            int a=sc.nextInt();
            if(!GeneralUtils.searchInArr(INNarr,a)){
                throw new InvalidInnExeption();
            }
        }catch(Exception e){
            throw new InvalidInnExeption("ИНН не действителен");
        }

    }
}
