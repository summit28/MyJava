class Random 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i<1; i++){
			int num = (int)(Math.random()*10);
			if(num >= 1 && num <= 3)
			{
				System.out.println(num+" ");
				continue;
			}
			i--;
		}
	}
}
