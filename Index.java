class Index 
{
	//find mod without using % and bitwise
	/*public static void evenodd(int n){
		System.out.println(n);
		if((n/2)*2 == n){
			System.out.println("Num is even");
		}
		else{
			System.out.println("Num is odd");
		}
	}	
	*/

	public static void main(String[] args) 
	{
		//evenodd(4);
		
		//Narrowing Cycle
		byte b = (byte)128; //-128 //range 0 to 127=128
		System.out.println(b); //-128
		
		short s = (short)32768;
		System.out.println(s); // -32767
		
		int a = (int)2147483648l;
		System.out.println(a); //-2147483648
		
		//Compound Assignment Operator can perform narrowing in java
		char ch = 'a';
		ch += 20.36;;
		System.out.println(ch); // 97+20=117 u
	}
}
