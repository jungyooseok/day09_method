package day09_method;

import java.util.Scanner;

public class Quiz03Main {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Quiz03 mul = new Quiz03();
		int num1;
		System.out.print("�� �Է� : ");
		num1 = input.nextInt();
		int result = mul.multipleCheck(num1);
		mul.outPut(num1,result);
	}

}
