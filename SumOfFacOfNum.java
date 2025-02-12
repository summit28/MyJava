class SumOfFacOfNum{
	public static void main(String[] args) {
		int num = 20;
		int sum =0;


		for(int i=1;i<=num;i++){
			if(num%i==0){
				sum+=i;
			}
		}
		System.out.println(sum);

		// Exculdeing 1 and num
		// for(int i=2;i<num;i++){
		// 	if(num%i==0){
		// 		sum+=i;
		// 	}
		// }
		// System.out.println(sum);

		//find factors of num
		// for(int i=1;i<=num;i++){
		// 	if(num%i==0){
		// 		System.out.println(i);
		// 	}
		// }
		
	}
}
