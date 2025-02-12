import java.util.*;
class Celsius_To_Fahrenheit
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.print("Enter a degree in celsius: ");
		double cel = sc.nextDouble();
		System.out.println("Before conversion celsius is: "+ cel);
		
		//convert to fahrenheit
		double fah = (9/5d) * cel + 32d;
		System.out.println(cel + " celsius is: " +  fah);
		
	}
}
