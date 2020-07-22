package NewYearGifts.NewYearGifts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cookies extends Gifts {
	{
		super.type = "Cookies";
	}
	Scanner s = new Scanner(System.in);
	@Override
	public ArrayList<Integer> get() {
		//gets the number of children and the number of Cookie Boxes each child gets
		System.out.println("Enter the number of children:");
		int children = s.nextInt();
		System.out.println("Enter the number of Cookie Boxes each child gets:");
		ArrayList<Integer> cookies = new ArrayList<Integer>();
		for(int i=0;i<children;i++)
			cookies.add(s.nextInt());
		return cookies;
	}

	@Override
	public ArrayList<Integer> weight(ArrayList<Integer> cookies) {
		//calculates the weights of cookie boxes each child gets
		System.out.println("Enter the weight of one cookie box:");
		int box_weight = s.nextInt();
		ArrayList<Integer> cookies_wgt = new ArrayList<Integer>();
		for(int child:cookies)
		{
			cookies_wgt.add(child*box_weight);
		}
		return cookies_wgt;
	}

	@Override
	public ArrayList<Integer> sort_wgt(ArrayList<Integer> cookies_wgt) {
		//Sorting the weights of sweets
		ArrayList<Integer> sorted_cookies_wgt = new ArrayList<Integer>();
		for(int weight:cookies_wgt)
		{
			sorted_cookies_wgt.add(weight);
		}
		Collections.sort(sorted_cookies_wgt);
		return sorted_cookies_wgt;

	}

}
