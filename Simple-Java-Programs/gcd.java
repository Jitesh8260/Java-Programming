//Program to print gcd of two numbers
import java.util.Scanner;
public class gcd {
    public static void main(String []args) {
        int i;
        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fiirst Number");
        int m=sc.nextInt();
        System.out.println("Enter Second Number");
        int n=sc.nextInt();
        if(m>n){
            s=m;
        }
        else
            s=n;
        for(i=s;i>0;i--)
        {
            if(m%i==0 && n%i==0){
             System.out.println("GCD of "+m+" and "+n+" is "+i);
             break;
        }
        }
    }
}       
        
