class Increasingnumber{
	public static void main(String[] args) {
		String str = Integer.toString(135);
		int len =0;
		boolean flag = true;
		char ch;
		for(int i=0; i<str.length()-1; i++){
			ch = str.charAt(i);

			if(ch>str.charAt(i+1)){
				flag = false;	
				break;		
			}
		}
		if(flag){
			System.out.println("IncresingNumber:");
		}
		else{
			System.out.println("Not Increasingnumber:");
		}
	}
}