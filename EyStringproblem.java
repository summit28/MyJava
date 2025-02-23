class EyStringproblem{
	public static void main(String[] args) {
		String str = "1011111110";
		
		//optimize solution
		boolean check0 = str.contains("0000000");
		boolean check1 = str.contains("1111111");
		System.out.println(str);
		System.out.println(check0 || check1 ?"Yes":"No");

		//not optimize solution
		// int cnt1=0;
		// int cnt0=0;

		// for(int i=0; i<str.length();i++){
		// 	char ch = str.charAt(i);
		// 	if(ch=='1'){
		// 		cnt1++;
		// 	}
		// 	else if(ch=='0'){
		// 		cnt0++;
		// 	}
		// 	else{
		// 		cnt1=0;
		// 		cnt0=0;
		// 	}

		// 	System.out.println(ch+":"+cnt0+":"+cnt1);

		// 	if(cnt0>=7 || cnt1>=7){
		// 		break;
		// 	}
		// }
		// 	System.out.println(cnt0>=7 || cnt1>=7?"Yes":"No");

	}
}