//Write a java program that will sort an array of N inputted numbers.

import java.util.Scanner;
public class sortingarray{
public static void main(String []args) {
            int i,temp;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();
            int myArray[]=new int[n];
            System.out.println("Enter the elements of array");
            for(i=0;i<n;i++){
                myArray[i]=sc.nextInt();
            }
            for(i=0;i<n-1;i++){
                if(myArray[i]>myArray[i+1]){
                    temp=myArray[i];
                    myArray[i]=myArray[i+1];
                    myArray[i+1]=temp;
                    i=0;
                }
            }
            System.out.println("The Final Sorted Array is: ");
             for(i=0;i<n;i++){
                System.out.println(myArray[i]);
             }
            }
        }
        


    

