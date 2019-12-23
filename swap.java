package demo;
import java.util.Scanner;

public class Swap{
	void swap(int number1,int number2) {
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("number1= "+number1);
		System.out.println("number2= "+number2);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		Swap s=new Swap();
		s.swap(number1, number2);
		System.out.println("number1= "+number1);
		System.out.println("number2= "+number2);
		
		
		
	}
}
