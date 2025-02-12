class Narrowing_Conversion 
{
	public static void main(String[] args) 
	{
		//double conversion
		/*double a = 28.28;
		float b = (float)a;//28.28
		long c = (long)a;//28
		int d = (int)a;//28
		short e = (short)a;//28
		char ch = (char)a;//nothing is printed(two empty lines are printed)
		byte bt = (byte)a;//28
		System.out.println(ch);*/
		
		//float conversion
		//float a = 45.725f;
		//long b = (long)a;//45
		//int c = (int)a;//45
		//short d = (short)a;//45
		//char e = (char)a;//- or ?
		//byte bt = (byte)a;//45
		//System.out.println(bt);
		
		//long conversion
		//long a = 457896l;
		//int b = (int)a;//457896
		//short c = (short)a;//-856
		//char ch = (char)a;//?
		//byte bt = (byte)a;//-88
		//System.out.println(b);
		
		//int conversion
		//int a = 1234;
		//short b = (short)a;//1234
		//char ch = (char)a;//?
		//byte bt = (byte)a;//-46
		//System.out.println(bt);
		
		//short conversion
		//short a = 65;
		//char ch = (char)a;//A
		//byte bt = (byte)a;//65
		//System.out.println(ch);
		
		//char conversion
		//char ch = 'a';
		//byte bt = (byte)ch;//97
		//System.out.println(bt);
		
		//byte conversion
		//byte bt = 65;
		//char ch = (char)bt;//A
		//System.out.println(ch);	
	}
}
