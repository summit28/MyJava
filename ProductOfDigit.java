import java.util.*;
class ProductOfDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the number:");
		int num = sc.nextInt();

		int prod = 1;
		while(num>0){
			int rem = num%10;
			prod = prod * rem;
			num=num/10;
		}
		System.out.println("Product of num is : "+prod);
	}
}