package NewYearGifts.NewYearGifts;

import java.util.*;

public class Chocolates extends Gifts {
	{
		super.type = "Chocolate";
	}
	Scanner s = new Scanner(System.in);
	@Override
	public ArrayList<Integer> get() 
	{
		//gets the number of children and the number of chocolates each child gets
		System.out.println("Enter the number of children:");
		int children = s.nextInt();
		System.out.println("Enter the number of chocolates each student gets:");
		ArrayList<Integer> chocolates = new ArrayList<Integer>();
		for(int i=0;i<children;i++)
			chocolates.add(s.nextInt());
		return chocolates;
	}

	@Override
	public ArrayList<Integer> weight(ArrayList<Integer> chocolates) 
	{
		//calculates the weights of chocolates each child gets
		System.out.println("Enter the weight of one chocolate:");
		int weight = s.nextInt();
		ArrayList<Integer> chocolates_wgt = new ArrayList<Integer>();
		for(int child:chocolates)
		{
			chocolates_wgt.add(child*weight);
		}
		return chocolates_wgt;
	}

	@Override
	public ArrayList<Integer> sort_wgt(ArrayList<Integer> chocolates_wgt) 
	{
		//Sorting the weights of chocolates
		ArrayList<Integer> sorted_chocolates_wgt = new ArrayList<Integer>();
		for(int weight:chocolates_wgt)
		{
			sorted_chocolates_wgt.add(weight);
		}
		Collections.sort(sorted_chocolates_wgt);
		return sorted_chocolates_wgt;
	}

}
