import java.util.*;
class GoodPrimeInRange{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int range = sc.nextInt();

		for(int i=2; i<=range; i++){
			boolean flag = true;

			for(int j=2; j<i; j++){
				if(i%j==0){
					flag = false;
					break;
				}
			}
			if(flag){
				int rem = i%10;
				if(i==2 || i==3 || i==5 || i==7){
					System.out.print(i+" ");
				}
				if((rem%2!=0 && rem%3!=0 && rem%5!=0 && rem!=7 && rem!=1)){
					System.out.print(i+" ");
				}

			}
		}
	}
}