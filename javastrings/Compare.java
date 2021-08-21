package javastrings;
import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        int i;
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter 1st String value: ");
             String str = sc.next();
           System.out.println("Enter 1st String value: ");
           String str1 = sc.next();
        if(str.length()!=str1.length())
        {
            System.out.println("strings are not same or it's lenght are different");

        }
        int n=str.length();
        for(i=0;i<n;i++)
        {
            if(str.charAt(i)!=str1.charAt(i))
            {
                flag=false;
            }
        }
    if(flag==true)
    {
        System.out.println("strings are same");
    }
    else{
        System.out.println("strings are not same");
    }
}
    }  

