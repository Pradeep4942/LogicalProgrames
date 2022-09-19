package Logical_02;

import java.util.Scanner;

public class L_17_FactorealNum 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:->");
		int num = scan.nextInt();
		
		int fact = 1;
		
		for (int i =num  ; i >=1; i--)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
