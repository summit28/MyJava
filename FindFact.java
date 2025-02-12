class FindFact{
	public static void main(String[] args) {
		int num = 10;
		int fact =1;
		for(int i=1; i<=num; i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
	}
}
