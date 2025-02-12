class TimePass 
{
	public static void main(String[] args) {
	int n=4;
	int n1=4;
	{
		//patterns

		for(int i=1; i<=n; i++){
			//star
			for(int j=1; j<=n1; j++){
				if(j==1 || j==n1 || i==1 || i==n){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
}