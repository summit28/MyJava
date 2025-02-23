class Evilnumber{
	public static void main(String[] args) {
		int num =15;
		String bin ="";

		for(int i=num; i>0; i/=2){
			bin = (i%2)+bin;
		}
		System.out.println(bin);

		int cnt =0;
		for(int i=0; i<bin.length();i++){
			char ch = bin.charAt(i);
			if(ch=='1'){
				cnt++;
			}
		}
		System.out.println("count:"+cnt);
			if(cnt%2==0){
				System.out.println(num+" is Evilnumber:");
			}
			else{
				System.out.println(num+" is not Evilnumber:");
			}
	}
}