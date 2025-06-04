//Write a Java program to implement a calculator using interface 
import java.util.*;
class Testcal{
	public static void main(String args[])
	{
		Democalculator d1=new Democalculator(10,5);
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
	}
}
 interface Calculator{
	 void add();
	 void sub();
	 void mul();
	 void div();
}
class Democalculator implements Calculator{
	int num1,num2;
	Democalculator(int a,int b)
	{
		num1=a;
		num2=b;
	}
	public void add()
	{
		System.out.println("The addition of two numbers are:");
		int s=num1+num2;
		System.out.println(s);
	}
	public void sub()
	{
		System.out.println("The Subtraction of two numbers are:");
		int d=num1-num2;
		System.out.println(d);
	}
	public void mul()
	{
		System.out.println("The multiplication of two numbers are:");
		int m=num1*num2;
		System.out.println(m);
	}
	public void div()
	{
		System.out.println("The division of two numbers are:");
		int k= num1/num2;
		System.out.println(k);
	}
}


		
	
	
