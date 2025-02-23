class AllPatterns{
	public static void main(String[] args) {

		int n =4;

		//star pattern
		// for(int i=1; i<=n;i++){
		// 	for(int j=1; j<=i; j++){
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }

		//1 
		//1 2 
		//1 2 3 pattern
		// for(int i =1; i<=n; i++){
		// 	int num =1;
		// 	for(int j=1; j<=i; j++){
		// 		System.out.print(num++ +" ");
		// 	}
		// 	System.out.println();
		// }

		//1 
		//2 3 
		//4 5 6 pattern
		// int num =1;
		// for(int i =1; i<=n; i++){
		// 	for(int j=1; j<=i; j++){
		// 		System.out.print(num++ +" ");
		// 	}
		// 	System.out.println();
		// }

		//a
		//a b
		//a b c 
		// for(int i =1; i<=n; i++){
		// char ch = 'a';
		// 	for(int j=1; j<=i; j++){
		// 		System.out.print(ch++ +" ");
		// 	}
		// 	System.out.println();
		// }

		//a
		//b c
		//d e f 
		// char ch = 'a';
		// for(int i =1; i<=n; i++){
		// 	for(int j=1; j<=i; j++){
		// 		System.out.print(ch++ +" ");
		// 	}
		// 	System.out.println();
		// }

		//1
		//0 1 
		//1 0 1
		// for(int i =1; i<=n; i++){
		// 	for(int j=1; j<=i; j++){
		// 		if((i+j)%2==0){
		// 			System.out.print(1+" ");
		// 		}
		// 		else{
		// 			System.out.print(0+" ");
		// 		}
		// 	}
		// 	System.out.println();
		// }

		//2
		//4 6 
		//8 10 12
		// int num =2;
		// for(int i =1; i<=n; i++){
		// 	for(int j=1; j<=i; j++){
		// 		System.out.print(num++ +" ");
		// 		num+=1;
		// 	}
		// 	System.out.println();
		// }

		//1
		//3 5 
		//7 9 11
		// int num =1;
		// for(int i =1; i<=n; i++){
		// 	for(int j=1; j<=i; j++){
		// 		System.out.print(num++ +" ");
		// 		num+=1;
		// 	}
		// 	System.out.println();
		// }

		//a
		//1 2
		//b c d
		// int a =1;
		// char ch = 'a';
		// for(int i =1; i<=n; i++){
		// 	for(int j=1; j<=i; j++){
		// 		if(i%2!=0){
		// 			System.out.print(ch++ +" ");
		// 		}
		// 		else{
		// 			System.out.print(a++ + " ");
		// 		}
		// 	}
		// 	System.out.println();
		// }

		// 1
		// 2 6
		// 3 7 10
		// 4 8 11 13
		// 5 9 12 14 15
		int a=1; 
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				if(j%2!=0){
					System.out.print(a++ +" ");
					a+=1;
				}
				else{
					System.out.print(a++ +" ");
					a+=2;
				}
			}
			System.out.println();
		}


	}
}