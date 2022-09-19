package Logical_02;

public class L_18_SlitParameter
{
	public static void main(String[] args) 
	{
		
	String s1="my name is abc";
		
		
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		System.out.println(s1);
		
		System.out.println("------------");
		
//		for(int i=0; i<=ar.length-1; i++)
//		{
//			System.out.print(ar[i]+" ");
//		}
		System.out.println("Reverse line");
		
		for (int i = ar.length-1; i>=0 ; i--)
		{
			System.out.print(ar[i]+" ");
		}		
	}
}
