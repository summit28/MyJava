class Fascinatingwithoutusingstring{
	public static void main(String[] args) {
		
		int num = 192;
		int temp = num;
		int rem;
		boolean flag = true;
		for(int i=2; i<=3; i++){
			num = (num*1000) + (temp*i);
		}
		System.out.println(num);

		for(int i=1; i<=9; i++){
			int cnt=0;
			for(int j=num; j>0; j/=10){
				rem = j%10;
				if(rem==i){
					cnt++;
				}
			}
			if(cnt!=1){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.print(temp+" is a Fascinating number: ");
		}
		else{
			System.out.print(temp+" is a Fascinating not number: ");			
		}
	}
}