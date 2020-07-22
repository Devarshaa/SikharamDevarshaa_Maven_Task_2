package NewYearGifts.NewYearGifts;
import java.util.*;
public abstract class Gifts 
{
	String type;
	public abstract ArrayList<Integer> get();
	public abstract ArrayList<Integer> weight(ArrayList<Integer> gifts);
	public abstract ArrayList<Integer> sort_wgt(ArrayList<Integer> gift_weight);
	
}
