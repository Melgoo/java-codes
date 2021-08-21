package javastrings;
import java.util.Scanner;
public class Strrev {
    public static void main(String[] args) {
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
         String st=sc.nextLine();
         StringBuilder sb=new StringBuilder(st);
         System.out.println("The reverse of the "+st+" :"+sb.reverse());
    }
}
