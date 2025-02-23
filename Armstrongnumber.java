class Armstrongnumber{
	public static void main(String[] args) {
		
		int num = 153;
		int dup = num;
		int len = 0, sum =0;

		for(int i=num; i>0; i/=10){
			len++;
		}
		System.out.println("Number length is: "+len);


		while(num>0){
			int rem = num%10;
			int pow =1;
			for(int i=1; i<=len; i++){
				pow *=rem;
			}
				sum +=pow;
				num/=10;
			
		}
		System.out.println(dup==sum?dup+" is a Armstrong numbers: "
				:dup+" is not a Armstrong number: ");
	}
}