class largestofdigit{
	public static void main(String[] args) {
		int num = 46545;
		int max =0;
		int min=9;
		for(int i=num; i>0; i/=10){

			int dgt = i%10;
			if(max<dgt){
				max = dgt;
			}
			if(min>dgt){
				min = dgt;
			}
		}
		System.out.println("largest dgt from "+num+" is : "+ max);
		System.out.println("largest dgt from "+num+" is : "+ min);

	}
}