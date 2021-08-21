import java.util.Scanner;
public class Evenodd {
    public static void main(String args[])
    {
        System.out.println("Enter the no=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" "+"no is even");
        }
        else{
            System.out.println(n+" "+"no is odd");
        }
    }
    
}
