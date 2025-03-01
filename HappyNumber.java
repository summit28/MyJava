class HappyNumber{
	public static void main(String[] args) {
		happy(2);
		
	}
	public static void happy(int n){
		int rem = 0, sum =0;
		int rem1 =0, sum1 = 0;
		while(n>0){	
			rem = n%10;
			sum = sum + (rem*rem);
			n/=10;
			// System.out.println(sum);
		}
		if(sum==1){
			System.out.println("HappyNumber:");
		}
		else{
			System.out.println("Not HappyNumber:");
		}

		while(sum>0){
			rem1 = sum%10;
			sum1 = sum1 + (rem1*rem1);
			sum1/=10;
			System.out.println(sum1);
		}

		if(sum1==1){
			System.out.println("HappyNumber:");
		}
		else{
			System.out.println("Not HappyNumber:");
		}
	}
}