package javastrings;
import java.util.Scanner;
public class Concate {
    public static void main(String[] args) {
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
         String st=sc.nextLine();
         String st1=sc.nextLine();
         System.out.println("The string is :"+(st+st1));
    }
}
