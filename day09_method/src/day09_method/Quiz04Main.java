package day09_method;

import java.util.Scanner;

public class Quiz04Main {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Quiz04 prime = new Quiz04();
		int num1;
		System.out.print("¼ö ÀÔ·Â : ");
		num1 = input.nextInt();
		int result = prime.primeCheck(num1);
		prime.outPut(num1,result);
	}

}
