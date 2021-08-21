package javastrings;
import java.util.Scanner;
public class Strcpy {
    public static void main(String[] args) {
        String st1;
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
         String st=sc.nextLine();
         st1=st;
         System.out.println("The copied string :"+st1);
    }
}
