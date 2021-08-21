package javastrings;
import java.util.Scanner;
public class Strcompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st string:");
        String st=sc.nextLine();
        System.out.println("enter 2nd string:");
         String st1=sc.nextLine();
         System.out.println("The concatinate of the string "+st+" and  "+st1+" : "+st.compareTo(st1));
    }
}
