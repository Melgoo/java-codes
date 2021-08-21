import java.util.Scanner;
public class swap {
    public static void main(String args[]){
        int a,b;
        System.out.println("Enter  1st number=");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter  2nd number=");
        b=sc.nextInt();
         int c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("swaping of 1st number="+a);
        System.out.println("swaping of 2nd number="+b);
        }
}
