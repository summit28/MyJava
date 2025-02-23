class Sunnynumber{
	public static void main(String[] args) {
		int num = 80;
		int dup = num+1;
		// System.out.print(dup);
		boolean flag = false;

		for(int i=1; i*i<=dup; i++){
			if(i*i==dup){
				flag =true;
				break;
			}
		}
			if(flag){
				System.out.println(dup+" is a Sunnynumber:");
			}
			else{
				System.out.println(dup+" is not Sunnynumber:");
			}
	}
}