package Logical01;

public class L_11_Without_Multi_Operation 
{
	public static void main(String[] args) 
	{
		int num1 =25;
		int num2 =75;
		int sum  = 0;
//		
//		for (int i =1; i<=num1; i++)
//		{
//			sum = sum+num2 ;	
//		}
//		System.out.println(sum);
		
		for (int i=1 ;i<=num2; i++)
		{
			sum= sum +num1;
		}
		System.out.println(sum);
	}

}
