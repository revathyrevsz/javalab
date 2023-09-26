
/*
 * File    : Adding two numbers
 * Description : finding Sum
 * Author : Revathy
 * Version : 2.0
 * Date : 26/9/23
 */

import java.util.Scanner;
public class AddtwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum is "+sum);
	}

}
