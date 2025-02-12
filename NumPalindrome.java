import java.util.*;
class NumPalindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp= num;
		int rev =0;
		for(int i=num; i>0; i/=10){
			int rem = num%10;
		    rev = rev*10 + rem;
			num/=10;
		}
		if(temp==rev){
			System.out.println("Number is Palindrome: ");
		}
		if(temp!=rev){
			System.out.println("Number is not Palindrome: ");
		}
	}
}