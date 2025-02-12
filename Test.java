import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		
		int a = 3;
		int b = 228;
		int c = 694;
		int d = 0;
		
		//finding smaller num out of four
		/*int smaller = (a<b)? ((a<c)?((a<d)? (a):(d)):(c<d)? (c):(d)) : 
		((b<c)?((b<d) ? (b):(d)) : ((c<d)?(c):(d)));
		System.out.println(smaller);
		
		//finding larger num out of four
		int larger =  (a>b)? ((a>c)? ((a>d)? (a):(d)) :(c>d)?(c):(d)) :
		((b>c)? ((b>d)?(b):(d)) : ((c>d)?(c):(d)));
		System.out.println(larger);
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight: ");
		double weight = sc.nextDouble();
		System.out.print("Enter height: ");
		double height = sc.nextDouble();
		
		//conversion
		double kilograms = weight * 0.45359237; 
		double meter = height * 0.0254;
		
		//calculating BMI
		double bmi = kilograms / (meter * meter);
		System.out.println("Body mass Index is: " + bmi);

		//FactorailSum -- supritbhai
		int num = 5;
		int dup = num;
		int sum = 0; 
		int fact =1;
		for(int i =1; i<=num; i++){
			fact = fact *i;
			sum = sum+i;
		}
		System.out.println(fact);
		System.out.println(sum);
		
		
	}
}
 