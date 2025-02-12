import java.util.*;
class Pounds_Into_Kilogram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Pound value: ");
		float pound = sc.nextFloat();
		
		//convert pound to kilograms
		float kigram = pound * 0.454f; 
		
		System.out.println(pound + " pounds is: " + kigram);
	}
}
