import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        int i,a=0,b=1,c,temp=0;
        System.out.println("enter the no=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        for(i=0;i<n;i++){
            c=a+b;
             a=b;
             b=c;
             System.out.println(c);
        }
    }
}
