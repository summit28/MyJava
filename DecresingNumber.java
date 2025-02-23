class DecresingNumber{
	public static void main(String[] args) {
		String str = Integer.toString(4321);
		boolean flag = true;

		for(int i=0; i<str.length()-1; i++){
			char ch = str.charAt(i);

			if(ch<str.charAt(i+1)){
				flag = false;
				break;
			}
		}

		if(flag){
			System.out.println("DecresingNumber:");
		}
		else{
			System.out.println("Not DecresingNumber:");
		}
	}
}