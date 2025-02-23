class Advancenumberpattern{
	public static void main(String[] args) {
		
		// 1 8 9  16
		// 2 7 10 15
		// 3 6 11 14
		// 4 5 12 13
		// int n=4;
		// int evenDiff=7;
		// int oddDiff=1;

		// for(int i=1; i<=n; i++){

		// 	System.out.print(i+" ");
		// 	int temp= i;

		// 	for(int j=2; j<=n; j++){
		// 		if(j%2==0){
		// 			temp=temp+evenDiff;
		// 			System.out.print(temp+" ");
		// 		}
		// 		else{
		// 			temp=temp+oddDiff;
		// 			System.out.print(temp+" ");
		// 		}

		// 	}
		// 	System.out.println();
		// 	evenDiff-=2;
		// 	oddDiff+=2;
		// }

		//1
		//2 7
		//3 6 8
		//4 5 9 10
		int n=4;
		int evenDiff=7;
		int oddDiff=-2; //change 1 to -2

		for(int i=1; i<=n; i++){

			System.out.print(i+" ");
			int temp= i;

			for(int j=2; j<=i; j++){ //change n to i
				if(j%2==0){
					temp=temp+evenDiff;
					System.out.print(temp+" ");
				}
				else{
					temp=temp+oddDiff;
					System.out.print(temp+" ");
				}

			}
			System.out.println();
			evenDiff-=2;
			oddDiff+=2;
		}
	}
}