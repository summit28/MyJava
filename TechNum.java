class TechNum{
	public static void main(String[] args) {
		int num = 2025, div = 1;
		int len =0,  sum =0;
		for(int i=num; i>0; i/=10){
			len++;
		}

		if(len%2==0){
			for(int i=1; i<=(len/2); i++){
				div*=10;
			}
			sum = (num/div) + (num%div);
			int sqr = sum * sum;
		System.out.println(sqr==num?num+" is a TechNum: ":num+" is not a TechNum:");	
		}
		else{
			System.out.println("Not a TechNum: ");
		}
	}
}