package Logical_02;

public class L_14_ReverseString 
{
	public static void main(String[] args) 
	{
		
	String org = "ABCDEFGH";
	String rev = "";
	
	for (int i= org.length()-1; i>=0; i--)
	{
		rev = rev+org.charAt(i);
	}
	//System.out.println(org);
	System.out.println(rev);
	
	
	}
}
