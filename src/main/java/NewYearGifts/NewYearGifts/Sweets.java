package NewYearGifts.NewYearGifts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sweets extends Gifts {
	{
		super.type = "Sweets";
	}
	Scanner s = new Scanner(System.in);
	@Override
	public ArrayList<Integer> get() 
	{
		//gets the number of children and the number of sweet boxes each child gets
		System.out.println("Enter the number of children:");
		int children = s.nextInt();
		System.out.println("Enter the number of sweet boxes each child gets:");
		ArrayList<Integer> sweets = new ArrayList<Integer>();
		for(int i=0;i<children;i++)
			sweets.add(s.nextInt());
		return sweets;
	}

	@Override
	public ArrayList<Integer> weight(ArrayList<Integer> sweets) 
	{
		//calculates the weights of chocolates each child gets
		System.out.println("Enter the weight of one sweet box:");
		int box_weight = s.nextInt();
		ArrayList<Integer> sweets_wgt = new ArrayList<Integer>();
		for(int child:sweets)
		{
			sweets_wgt.add(child*box_weight);
		}
		return sweets_wgt;
	}

	@Override
	public ArrayList<Integer> sort_wgt(ArrayList<Integer> sweets_wgt) 
	{
		//Sorting the weights of sweets
		ArrayList<Integer> sorted_sweets_wgt = new ArrayList<Integer>();
		for(int weight:sweets_wgt)
		{
			sorted_sweets_wgt.add(weight);
		}
		Collections.sort(sorted_sweets_wgt);
		return sorted_sweets_wgt;
	}

}
