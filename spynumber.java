class spynumber{
	public static void main(String[] args) {
		int num = 1124; //22
		int dup = num;
		int sum =0;
		int prod = 1;

		for(int i=num; i>0; i/=10){
			int rem = num%10;
			sum+=rem;
			prod*=rem; 
			num/=10;
		}
		System.out.println(sum==prod?dup+" is a spynumber:"
							:dup+" is not spynumber:");
	}
}