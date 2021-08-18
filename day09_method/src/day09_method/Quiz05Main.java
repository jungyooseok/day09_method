package day09_method;

import java.util.Scanner;

public class Quiz05Main {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Quiz05 absolute = new Quiz05();
		int num1;
		System.out.print("¼ö ÀÔ·Â : ");
		num1 = input.nextInt();
		int result = absolute.absoluteCheck(num1);
		absolute.outPut(num1,result);
	}

}
