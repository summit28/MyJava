import java.util.*;
class Buzz{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();

		if(num%7==0 || num%10==7){
			System.out.println(num+" is buzz number:");
		}
		else {
			System.out.println(num+" is not buzz number: ");
		}
	}
}