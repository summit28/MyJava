import java.util.*;
class Emirp {
	//using count
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int rev = 0;
		int cnt =0;
		int cnt1=0;
		for(int i=num; i>0; i/=10){
			int rem = i%10;
			rev = rev*10 + rem;
		}	
		System.out.print("Reverse of "+num+" is: "+rev);
		System.out.println();

		for(int i=2; i<num; i++){
			if(num%i==0){
				// System.out.println(i);
				cnt++;
			}
		}

		for(int i=2; i<rev; i++){
			if(rev%i==0){
				// System.out.println(i);
				cnt1++;
			}
		}
		if(cnt==0 && cnt1==0){
			System.out.println("Number is Emirp: ");
		}
		else{
			System.out.println("Number is not Emirp: ");
		}
	}
}
