/*Java Program to Interchange Elements of First and Last in a Matrix Across Rows
Input 1: 1 1 5 0
 2 3 7 2
 8 9 1 3
 6 7 8 2
Output 1: 6 7 8 2
 2 3 7 2
 8 9 1 3
 1 1 5 0
Input 2: 7 8 9 10
 11 13 14 1
 15 7 12 22
 11 21 30 1
Output 2: 11 21 30 1
 11 13 14 1
 15 7 12 22
 7 8 9 10 */

import java.util.Scanner;

public class swapmatrix {

    public static void main(String []args) {
            int i,j;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int m=sc.nextInt();
             System.out.println("Enter no of rows");
            int n=sc.nextInt();
            int myArray[][]=new int[m][n];
            System.out.println("Enter the elements of array");
            for(i=0;i<m;i++){
                for(j=0;j<n;j++)
                myArray[i][j]=sc.nextInt();
            }
            System.out.println("Matrix is:");
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                System.out.println(myArray[i][j]+"  ");
                System.out.println("\n");
                }
            }
            for(i=0;;){
                for(j=0;j<n;j++){
                
                }
            }
            System.out.println("Matrix after swapping Elements of first and last Across Row");

            }

    
}
