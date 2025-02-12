import java.util.*;
class Area_Of_Circle 
{
	public static void main(String[] args) 
	{
		final float pi = 22/7f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		float radius = sc.nextFloat();
		float areaofcircle = pi * (radius * radius);
		System.out.println("Area of Circle is: " + areaofcircle);
	}
}
