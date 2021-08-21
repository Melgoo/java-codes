package javastrings;
import java.util.Scanner;
public class Strlen {
     public static void main(String[] args) {
       System.out.println("enter the string:");
       Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println("The lenght of the "+st+" :");
        System.out.println(st.length());
    }
}
