import java.util.Scanner;
class EasyEmirp{
	//using flag
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int rev = 0;
		boolean flag = true;
		for(int i=num; i>0; i/=10){
			int rem = i%10;
			rev = rev*10 + rem;
		}	
		System.out.print("Reverse of "+num+" is: "+rev);
		System.out.println();

		for(int i=2; i<num; i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}

		for(int i=2; i<rev; i++){
			if(rev%i==0){
				flag = false;
			}
		}
		if(flag){
			System.out.println("Number is Emirp: ");
		}
		else{
			System.out.println("Number is not Emirp: ");
		}
	}
}