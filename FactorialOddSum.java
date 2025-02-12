class FactorialOddSum{
public static void main(String[] args) {
	int num = 1234;
	int dup = num;
	int sum =0;

	while(num>0){
		int rem = num%10;
		if(rem%2!=0){
			int fact =1;
			for(int i=rem; i>1; i--){
				fact *=i;
			}
			sum+=fact;
			System.out.println(sum);
		}
		num=num/10;
	}
	System.out.println(dup+" Oddsum is: "+sum);
}
}