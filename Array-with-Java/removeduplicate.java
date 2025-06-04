/*Write a java program that will read array of N numbers, and it will remove the duplicate
numbers (if any) and display the array.*/

import java.util.Scanner;

public class removeduplicate {
    public static void main(String []args) {
            int i,j,k;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();
            int myArray[]=new int[n];
            System.out.println("Enter the elements of array");
            for(i=0;i<n;i++){
                myArray[i]=sc.nextInt();
            }
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    if(myArray[i]==myArray[j]){
                        System.out.println("Duplicate Found of"+myArray[i]);
                        for(k=j+1;k<n;k++){
                            myArray[j]=myArray[k];
                        }
                        n=n-1;
                    }
                }
            }
            System.out.println("final Array is ");
            for(i=0;i<n;i++){
                System.out.println(myArray[i]);
            }
    }


    
}
