class Kithnumber{
	public static void main(String[] args) {
		
		int num = 19; //742
		int temp = num;
		int len = 0;
		int sum = 0;
		boolean flag = true;

		for(int i=num; i>0; i/=10){
			len++;
		}
		System.out.println("Number length is: "+len);

		int arr[] = new int[len];

		//loops to store the init digit form a number
		for(int i=len-1; i>=0; i--){
			int rem = num%10;
			arr[i]= rem;
			num/=10;
		}

		for(;;){
			for(int i=0; i<len; i++){
				sum+=arr[i];
			}
			
		
			//swapping the elements
			for(int i=1; i<len; i++){
				arr[i-1] = arr[i];
			}
				arr[len-1]=sum;

			System.out.println(sum);
			if(temp==sum){
			break;
			}

			if(sum>temp){
			flag = false;
			break;
			}
			sum=0;

		}
		if(flag){
			System.out.println(temp+" is Kithnumber:");
		}
		else{
			System.out.println(temp+" is not Kithnumber:");
		}

	}
}