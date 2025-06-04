class OddProduct extends Thread {
    private int[]= number1;
    private int[]= number2;

     public Square(int arr1,int arr2) {
        this.number1 = arr1;
        this.number2 = arr2;
    }

    public void run() {
       for(int i=0;number1[i]!=/0;i++){
       if(i%2!=0){
                System.out.println("Product : "+number1[i]*number2[i]);
       }
    }
    }
}
class EvenProduct extends Thread {
    private int[]= number1;
    private int[]= number2;

    public Square(int arr1,int arr2) {
        this.number1 = arr1;
        this.number2 = arr2;
    }

    public void run() {
       for(int i=0;number1[i]!=/0;i++){
       if(i%2=0){
                System.out.println("Product : "+number1[i]*number2[i]);
       }
    }
    }
}
public class Vector {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5,6};
        int arr2[] ={1,2,3,4,5,6};

        Thread OddProduct = new OddProduct(arr1,arr2);
        OddProduct.start();
        Thread EvenProduct = new EvenProduct(arr1,arr2);
        EvenProduct.start();
    }
    
}
