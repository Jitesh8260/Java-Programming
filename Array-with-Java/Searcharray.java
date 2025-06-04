//Write a java program that will search a number from an array of 10 numbers
import java.util.Scanner;
   public class Searcharray{
        public static void main(String []args) {
            int i;
            int[] myArray = {0, 1, 2, 3};
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Number You Want To Search");
            int n=sc.nextInt();
            for(i=0;i<4;i++){
                if(myArray[i]==n){
                    System.out.println("Number Found");
                }
            }
        }
    }


