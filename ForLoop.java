class ForLoop 
{
	public static void main(String[] args) 
	{
		//1 to 10
		for(int i=1; i<=10; i++){
			System.out.println(i+" ");
		}
		//A to Z
		for(char ch = 'A'; ch<='Z'; ch++){
			System.out.println(ch+" ");
		}
		//a to z
		for(char ch = 'a'; ch<='z'; ch++){
			System.out.println(ch+" ");
		}
		//0 to 9
		for(char i= '0'; i<='9'; i++){
			System.out.println(i);
		}
		
		//ASCII
		for(int i=0; i<=127; i++){
			System.out.println(i +":"+((char)i));
		}
		
	}
}
