import java.util.Scanner;
import java.io.*;
class Prime{
    public static void main(String args[]){
        int i,n,flag=0;
        System.out.println("Enter any number=");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" "+"is not prime no");
            }
            else{
                System.out.println(i+" "+ "is prime no");
            }
        }
    
        
    }

}
