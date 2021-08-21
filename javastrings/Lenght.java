package javastrings;
import java.util.Scanner;
public class Lenght {
    public static void main(String[] args) {
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
         String st=sc.nextLine();
         int i=0;
        for(char c: st.toCharArray())
        {
            i++;
        }
         System.out.println("The lenght of the "+st+" :"+i);
    }
}
