class Neon{
	public static void main(String[] args) {
		int num = 9;
		int sqr = num*num;
		int sum=0;
		int rem =0;
		// System.out.println(sqr);
		for(int i=sqr; i>0; i/=10){
			rem = i%10;
			// System.out.println(rem);
			sum+=rem;
		}
			// System.out.println(sum);
		System.out.println(sum==num?num+" is a Neon Number:"
							:num+" is not a Neon Number:");
	}
}