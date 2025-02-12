class Test1
{
	public static void main(String[] args)
	{
	 int num = 1234;
	 int sum =0;
	 int temp = num;

	 for(int i=num; i>=1; i--)
	 {
	 	 int rem = num%10;
	 	 if(rem%2==0 || rem%2!=0)
	 	 {
	 	 	sum += rem;
	 	 }
	 	 num = num/10;
	 }	
	 System.out.println(sum);
	}
}