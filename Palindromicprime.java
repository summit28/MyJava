import java.util.Scanner;
class Palindromicprime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int ip = sc.nextInt();
		int rev = isreverse(ip);

		if(ip==rev && isPrime(ip)){
			System.out.println("It is Palindrome prime number:");
		}
		else{
			System.out.println("Not Palindrome prime number: ");
		}
	}

	public static int isreverse(int n){
		int rev = 0;
		for(int i=n; i>0; i/=10){
			rev = rev * 10 + (i%10);
			n/=10;
		}
		return rev;
	}

	public static boolean isPrime(int num){
		int dem =2;
		boolean flag = true;
		if(num>1){
            while(dem<num){
            if(num%dem==0){
            	flag = false;
                break;
            }
            dem++;
            }
        }
		return flag;
	}
}