import java.util.*;
class test2Prime {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int rev = 0;
		boolean flag = true;

		for(int i=2, j=dup; i<num && j > 0; i++, j/=10) {
			if(num%i==0) {
				flag = false;
				break;
			}

			rev = rev * 10 + (j % 10);
			if(rev%i==0)  {
				flag = false;
				break;
			}
		}

		if(flag) {
			System.out.println("The Number is Emirp");
		}
		else {
			System.out.println("The Number is Not");
		}
	}
}
