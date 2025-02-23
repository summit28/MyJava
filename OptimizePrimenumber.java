class OptimizePrimenumber{
	public static void main(String[] args) {
		int num = 5;
        int dem = 2;

        if(num>1){
            while(dem<num){
            if(num%dem==0){
                break;
            }
            dem++;
            }
        }
        System.out.println(num+":"+dem);
        if(num==dem){
            System.out.println("PrimeNumber:");
        }
        else{
            System.out.println("NotPrimeNumber:");
        }
	}
}