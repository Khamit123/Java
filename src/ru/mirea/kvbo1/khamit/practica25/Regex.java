package ru.mirea.kvbo1.khamit.practica25;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {


    //Проверить, надежно ли составлен пароль. Пароль считается надежным, если он состоит из 8 или более символов. Где символом может быть цифр, английская буква, и знак подчеркивания. Пароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру. 
    //– пример правильных выражений: F032_Password, TrySpy1. 
    //– пример неправильных выражений: smart_pass, A007.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String input = sc.next("\\w+");
        } catch (InputMismatchException exception) {
            System.out.println("Некоректный пароль");
        }


//    Написать регулярное выражение, определяющее является ли данная строчка допустимым (корректным) е-mail адресом согласно RFC под номером 2822. 
        //         – пример правильных выражений: user@example.com, root@localhost
        //      – пример неправильных выражений: myhost@@@com.ru, @my.ru, Julia String.
        Pattern pattern2 = Pattern.compile("\\w+@\\w+\\.[a-zA-Z]{2,5}");
        Matcher matcher = pattern2.matcher("@my.ru");
        System.out.println(matcher.matches());
    }
}
