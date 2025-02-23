class HighestRepCharInString{
	public static void main(String[] args) {
		String str = "AAAABCDA";
		int max =0;
		for(char ch ='A'; ch<'Z'; ch++){
			int cnt =0;
			for(int i=0; i<str.length(); i++){

			char ch1 = str.charAt(i);
			if(ch1==ch){
				cnt++;
			}
		}
			if(max<cnt){
				max=cnt;
			}
		}

		System.out.println(max);
	}
}