import java.util.*;
class Calculate_Tips 
{
	public static void calculatetips(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Bill: ");
		float Bill = sc.nextFloat();
		
		System.out.print("Enter the rate: ");
		float rate = sc.nextFloat();
		
		float Tip = Bill* (rate/100);
		System.out.println("Tips total is: "+ Tip);
		
		float Grand_Total = Bill + Tip;
		System.out.println("Grand total is: "+ Grand_Total);
		
	}
	public static void main(String[] args) 
	{
		calculatetips();
	}
}
