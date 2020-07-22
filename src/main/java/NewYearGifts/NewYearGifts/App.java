package NewYearGifts.NewYearGifts;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
       Chocolates Lindt = new Chocolates();
       Sweets Cake_pops = new Sweets();
       Cookies Butter_cookies = new Cookies();
      ArrayList<Integer> input = Lindt.get();
      System.out.println("Given list of Lindt chocolates:"+input);
      ArrayList<Integer> weight = Lindt.weight(input);
      System.out.println("Weights of Lindt chocolates at children:"+ weight);
      ArrayList<Integer> sorted_weights = Lindt.sort_wgt(weight);
      System.out.println("Weights of Lindtchocolates in sorted order:"+ sorted_weights);
      input = Cake_pops.get();
      System.out.println("Given list of Cake_pops:"+input);
      weight = Cake_pops.weight(input);
      System.out.println("Weights of Cake_pops at children:"+ weight);
       sorted_weights = Cake_pops.sort_wgt(weight);
      System.out.println("Weights of Cake_pops in sorted order:"+ sorted_weights);
       input = Butter_cookies.get();
      System.out.println("Given list of Butter_cookies:"+input);
       weight = Butter_cookies.weight(input);
      System.out.println("Weights of Butter_cookies at children:"+ weight);
       sorted_weights = Butter_cookies.sort_wgt(weight);
      System.out.println("Weights of Butter_cookies in sorted order:"+ sorted_weights);
    }
}
