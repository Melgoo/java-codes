import java.util.Scanner;
public class Choicecalculation {
    public static void main(String args[]){
        int n,a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice=");
        n=sc.nextInt();
        switch(n)
        {
            case 1: 
            System.out.println("Your choice is Addition");
            System.out.println("enter two nos:");
           a=sc.nextInt();
           b=sc.nextInt();
            c=a+b;
            System.out.println("Addition of "+a+" and "+b+" is:"+c);
            break;
            case 2:
            System.out.println("Your choice is Subtraction");
            System.out.println("enter two nos:");
           a=sc.nextInt();
           b=sc.nextInt();
            c=a-b;
            System.out.println("Subtraction of "+a+" and "+b+" is:"+c);
            break;
            case 3:
            System.out.println("Your choice is Multiplication");
            System.out.println("enter two nos:");
           a=sc.nextInt();
           b=sc.nextInt();
            c=a*b;
            System.out.println("Multiplication of "+a+" and "+b+" is:"+c);
            break;
            case 4:
            System.out.println("Your choice is Divition");
            System.out.println("enter two nos:");
            a=sc.nextInt();
           b=sc.nextInt();
            c=a/b;
            System.out.println("Divition of "+a+" and "+b+" is:"+c);
            break;
        }
        System.out.println("Finish");
    }
}
