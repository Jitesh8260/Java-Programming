//Write a Java program to test the number is prime or composite.
import java.util.Scanner;
public class checkprime {
    public static void main(String []args) {
        int i;
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0){
            j++;
            }
        }
        if(j>2){
             System.out.println("The Number is Composite");
        }
        else 
         System.out.println("The Number is Prime");

    
}
}
