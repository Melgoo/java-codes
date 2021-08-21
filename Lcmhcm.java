import java.util.Scanner;
public class Lcmhcm {
    public static void main(String args[]){
        int a,b,hcf=1,lcm=1;
        System.out.println("Enter two numbers=");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
       for(int i=1;i<=a;i++)
       {
        if(a%i==0 && b%i==0)
        {
            hcf=i;
        }
       }
       System.out.println("HCF is="+hcf);    // GCD also HCF.........
        lcm=(a*b)/hcf;
        System.out.println("LCM is="+lcm);
    }
}
