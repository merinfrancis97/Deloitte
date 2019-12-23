package demo;

import java.util.Scanner;

public class Leapyear {
	void leapyear(int year) {
		if(year%400==0)
			System.out.println("Leap Year");
		else if(year%4==0&&year%100!=0)
			System.out.println("leap Year");
		else
			System.out.println("Non leap Year");
	}
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	Leapyear l=new Leapyear();
	l.leapyear(year);
	}

}