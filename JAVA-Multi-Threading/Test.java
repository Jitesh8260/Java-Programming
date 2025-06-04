class Square extends Thread {
    private int number;

    public Square(int number) {
        this.number = number;
    }

    public void run() {
       
                System.out.println("Square of the number: "+ number*number);
    }
}
class Sumofdigits extends Thread{
    private int number;
    public Sumofdigits(int number) {
        this.number=number;  
    }
    public void run() {
        int x=number*number;
        int i=0;
        int sum=0;
        while( x!=0)
        {
            i=x%10;
            sum=sum+i;
            x=x/10;
        }
        System.out.println("Sum of the digits of the squared number: "+ sum);

    }
}
public class Test {
    public static void main(String[] args) {
        int m=25 ;

        Thread Square = new Square(m);
        Square.start();
        Thread Sumofdigits = new Sumofdigits(m);
        Sumofdigits.start();
    }
}
