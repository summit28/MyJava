class Krishnamurtinumber{
	public static void main(String[] args) {
		//also called as peterson num
		int num = 145;
		int dup =num;
		int sum=0;

		for(int i=num; i>0; i/=10){
			int rem = num%10;
			int fact = 1;
			for(int j=1; j<=rem; j++){
				fact*=j;
			}
				sum+=fact;
				num/=10;

		}
		System.out.println(dup==sum?dup+" is a krishna number: ":
			               dup+" is not krishna number: ");	
	}
}