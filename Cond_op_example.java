class Cond_op_example
{
	public static void main(String[] args) 
	{
		//finding smaller num out of three
		int a = 2;
		int b = 4;
		int c = 6;
		
		//finding smaller num out of three
		int small = (a<b)? ((a<c)?(a):(b)) : ((b<c)?(b):(c));
		System.out.println(small);
		
		//finding larger num out of three
		int larger = (a>b)? ((a>c)?(a):(b)) : ((b>c)?(b):(c));
		System.out.println(larger);
		
		 
	}
}
