//Write a Java program that will evaluate the following exponential series.
import java.util.Scanner;
public class seriessum {
    public static void main(String[] args) {
        double i,x,n;
        double sum=0,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number upto which u want series sum");
        n=sc.nextInt();
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
            sum=sum+((Math.pow(x,i))/(fact));
        }
        System.out.println("Sum of the series is:"+sum);
    }
}
