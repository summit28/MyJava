class Fascinating{
	public static void main(String[] args) {
		
		int num = 327; //192
		String str = num+""+(num*2)+(num*3);
		// System.out.println(str);
		boolean flag = true;

		for(char i='1'; i<='9'; i++){
			int cnt =0;
			for(int j=0; j<=str.length()-1; j++){
				char ch = str.charAt(j);
				if(ch==i){
					cnt++;
				}
			}
			if(cnt!=1){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println(num+" is a Fascinating number: ");
		}
		else{
			System.out.println(num+" is a not Fascinating number:");
		}
	}
}