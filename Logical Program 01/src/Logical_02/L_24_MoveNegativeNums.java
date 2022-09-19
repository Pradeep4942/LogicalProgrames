package Logical_02;

import java.util.ArrayList;
import java.util.List;

public class L_24_MoveNegativeNums
{
	public static void main(String[] args)
	{
		int ar [] = {1,45,-7,84,-45,-77,69};
		
		List<Integer> allNumbers = new ArrayList <>();
		List<Integer> negativeNum = new ArrayList <>();
		
		for (int data:ar)
		{
			if (data >=0) {allNumbers.add(data);}
			else { negativeNum.add(data);}
		}
	//	allNumbers.addAll(negativeNum);
		System.out.println(allNumbers);
	//	System.out.println(negativeNum);
	}

}
