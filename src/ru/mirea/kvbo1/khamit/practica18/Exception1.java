package ru.mirea.kvbo1.khamit.practica18;
import java.util.Scanner;

public class Exception1 {
    public static void exceptionDemo() {
        try {


            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NullPointerException e) {
                System.out.println("invalid format");
            }
        catch (ArithmeticException e){
            System.out.println("divide by zero");
        }
    }
    class ThrowsDemo {
        public static void getDetails(String key) {
            if(key == null) {
                throw new NullPointerException("null key in getDetails" );
            }
        }
    }
}
