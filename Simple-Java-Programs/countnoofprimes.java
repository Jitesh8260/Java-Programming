//Write a java program that will count the number of primes between 37 and 129.

public class countnoofprimes {
    public static void main(String []args) {
        int i,j,k=0,count=0;
        for(i=38;i<130;i++)
        {   k=0;
            for(j=1;j<i;j++)
            {
             if(i%j==0){
             k++;
            }
            }
             if(k<3){
             System.out.println(j+" is a prime number");
             count++;
        }
    }
         System.out.println("There are "+count+" Prime Numbers in between 37 and 129");
    
    }
}
