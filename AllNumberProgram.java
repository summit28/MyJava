class AllNumberProgram{
	public static void main(String[] args) {
		// factorial(5);
		//isprime(4);
		// Armstrongnum(1634);
		reverse(123);
	}

	public static void factorial(int n){
		int fact = 1;
		for(int i=1; i<=n; i++){
			fact= fact * i;
		}
		System.out.println(fact);
	}

	public static void isprime(int n){
		boolean flag = true;
		for(int i=2; i<n; i++){
			if(n%i==0){
				flag = false;
				break;
			}
		}

		if(flag){
			System.out.println("Prime Number:");
		}
		else{
			System.out.println("Not Prime Number:");
		}
	}

	public static void Armstrongnum(int n){
		int len = 0,sum =0, rem =0, pow=0;
		int dup =n;
		for(int i=n; i>0; i/=10){
			len++;
		}
		System.out.println("length:"+len);

		while(n>0){
			rem = n%10;
			pow= (int)Math.pow(rem,len);
			sum+=pow;
			n/=10;
		}
		if(sum==dup){
			System.out.println("Armstrongnum");
		}
		else{
			System.out.println("Not Armstrongnum");
		}
	}

	public static void reverse(int n){
		int rev =0,rem =0;
		int dup = Math.abs(n);
		// System.out.println(dup);
		for(int i=n; i>0; i/=10){
			rem = i%10;
			rev = rev * 10 + rem;
			n/=10;
		}
		System.out.println(rev);
	}
}