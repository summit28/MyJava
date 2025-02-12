class Even_Odd_Sum 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int Evensum = 0;
		int Oddsum = 0;
		int temp = 0;

	    int rem = num % 10;
		temp = (num%2==0)?(Evensum=Evensum+rem):(Oddsum= Oddsum+rem);
		num = num/10;
		
		rem = num % 10;
		temp = (num%2==0)?(Evensum=Evensum+rem):(Oddsum= Oddsum+rem);
		num = num/10;
		
		rem = num % 10;
		temp = (num%2==0)?(Evensum=Evensum+rem):(Oddsum= Oddsum+rem);
		num = num/10;
		
		rem = num % 10;
		temp = (num%2==0)?(Evensum=Evensum+rem):(Oddsum= Oddsum+rem);
		num = num/10;
		
		System.out.println("Evensum: "+ Evensum);
		System.out.println("Oddsum: "+ Oddsum);
		
		
	}
}
