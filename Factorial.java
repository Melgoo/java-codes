import java.util.Scanner;
public class Factorial {
    public static void main(String args[]) {
        int n,i,fact=1;
        System.out.println("Enter the number=");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
             fact=fact*i;
        }
        System.out.println("factorial no is="+fact);
    }
}
