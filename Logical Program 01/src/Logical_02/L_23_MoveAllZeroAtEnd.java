package Logical_02;

public class L_23_MoveAllZeroAtEnd
{
	public static void main(String[] args) 
	{
		int []ar = {0,2,3,0,33,0,5,56,0};
		
		int count = 0;
		
	for (int i =0 ; i<=ar.length-1; i++)
	{
		if (ar[i] != 0)
		{
			ar[count++] =ar[i];
		}
	}
	while (count <= ar.length-1 )
	{
		ar [count ++] =0;
	}
	for (int data:ar)
	{
		System.out.print(data +" ");
	}
		
		
	}


}
