class PrimeFactOfNum{
	public static void main(String[] args) {
		int num=10;

		for(int i=1; i<=num; i++){
			if(num%i==0){ //1 2 5 10
				if(i%2!=0 && i!=1 ){
				    System.out.print(i+" "); //1 5+
				}
				if(i==2){
					System.out.print(i+" ");
				}
			}
		}
	}
}

