import java.util.*;
class ConvertEvenToOddNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		String str = String.valueOf(num);
		// System.out.println(str);
		int len = str.length();
		// System.out.println("Length of a number is: "+len);
		int rem =0;
		int rev =0;
		int rev1 =0;

		if(len%2==0){
			while(num>0){
				rem = num%10;
				if(rem%2==0){
					rev = rev*10+rem;
				}
				else{
					rem+=1;
					rev = rev*10+rem;
				}
				num/=10;
			}
		}

		else{
			while(num>0){
				rem = num%10;
				if(rem%2!=0){
					rev = rev*10+rem;
				}
				else{
					rem+=1;
					rev = rev*10+rem;
				}
				num /=10;
			}
		}
		while(rev>0){
			rem = rev%10;
			rev1 = rev1*10+rem;
			rev/=10;
		}
		System.out.println(rev1);

	}
}
