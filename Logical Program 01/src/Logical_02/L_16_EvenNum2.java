package Logical_02;

public class L_16_EvenNum2 
{
	public static void main(String[] args) 
	{
		for (int num =0; num<=50; num++)
		{
			System.out.println(num);
			
			if (num % 2==0)
			{
				System.out.println("Given Numbers are Even");
			}
			else
			{
				System.out.println("Given Numbers are not Even");
			}
		}
		
	}

}
