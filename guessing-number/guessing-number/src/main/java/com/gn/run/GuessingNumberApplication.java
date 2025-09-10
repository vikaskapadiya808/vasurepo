package com.gn.run;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumberApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=new Random().nextInt(10);
		int enteredNumber=0;
		int count=0;
		
		while(count<3) {
			System.out.println("eNter the number");
			enteredNumber=sc.nextInt();
			
			count++;
			
			if(enteredNumber == number) {
				System.out.println("Number is matched ");
				break;
			}else if(enteredNumber>5 ) {
				System.out.println("Number is high");
			}else  {
				System.out.println("Number is low");
			}
		}
		if(count==3 && enteredNumber != number) {
			System.out.println("better luck next time number is : "+number);
		}
		sc.close();
		
	

	}
}
