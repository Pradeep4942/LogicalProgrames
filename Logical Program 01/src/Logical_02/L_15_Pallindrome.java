package Logical_02;

public class L_15_Pallindrome 
{
	public static void main(String[] args) 
	{
		String org = "MOM";
		String ave = "";
		
		for (int i = org.length()-1; i>=0 ;i--)
		{
			ave = ave+org.charAt(i);
		}
		System.out.println(ave);
		
		if (org.equals(ave))
		{
			System.out.println("Give String is Pallindrome");
		}
		else
		{
			System.out.println("Given String is not Pallindrome");
		}
	}

}
