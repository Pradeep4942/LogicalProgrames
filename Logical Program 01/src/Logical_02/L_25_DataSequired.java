package Logical_02;

public class L_25_DataSequired 
{
	private int set ;

	public int getSet()
	{
		return set;
	}

	public void setSet(int set)
	{
		if (set <=0) 
		{ throw new IllegalArgumentException("Please enter +ve Numbers");}
		
		this.set = set;
	}
	
	public void display () {
		
		System.out.println(this.set);
	}
	

}
