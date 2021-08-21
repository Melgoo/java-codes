import java.util.Scanner;
public class Leapyear {
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter the year=");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%4==0){
            System.out.println(n+" "+"year is leap-year");
        }
        else{
            System.out.println(n+" "+"year is not leap-year");
        }
    }
}
