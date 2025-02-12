import java.util.*;
class FactPrimeNO{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num: ");
		int num = sc.nextInt();
		int cnt = 0;

		for(int i=2; i<num; i++)
			if(num%2==0){
				cnt++;
			}
			System.out.println(cnt==0?num+" is Prime:":num+" is not Prime:");
		}

	}	