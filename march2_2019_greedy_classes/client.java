package march2_2019_greedy_classes;
import java.util.Arrays;
import java.util.Collections;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classes
		//there is a bag of 50kg, we have to fill it 
		// such that it has the max value, also we have 
		// different bags of dfferent weights and there 
		//respective weights, we can break open any bag in any fraction
		int[] wts={10,40,20,30};
		int[] prices={60,40,100,120};
		System.out.println(fractionalKnapsack(wts,prices,50));
	}

	public static int fractionalKnapsack(int[] wts, int[] prices, int bag){
		
		int vib=0; //value
		int sib=bag;//space
		
		Item[] items=new Item[wts.length];
		
		//constructor
		for(int i=0;i<wts.length;i++)
		{
			items[i]= new Item(wts[i],prices[i]);
		}
		
		Arrays.sort(items,Collections.reverseOrder());
		//reverse order
		int i=0;
		
		while(sib>0){
		if(items[i].wts<=sib)
		{
		 vib+=items[i].prices;
		 sib-=items[i].wts;
		}
		
		else if(items[i].wts>sib)
		{
			vib+=items[i].ratio*sib;
			sib=0;
		}
		i++;
		}
		return vib;
	}
	
	private static class Item implements Comparable<Item>{
		//comparable is the interface here to compare and we have a function for it		
		int wts;
		int prices;
		double ratio;
		
		Item(int wts, int prices)
		{
			this.wts=wts;
			this.prices=prices;
			this.ratio=prices*1.0/wts; //left to right "* and / both have same preference" 
		}
		
		public int compareTo(Item o){
			if(this.ratio < o.ratio)
				return -1;
			else if(this.ratio==o.ratio)
				return 0;
			else 
				return +1;
		}
	}
}
