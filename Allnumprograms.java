class Allnumprograms{
	public static void main(String[] args) {


		//technonum
		// int num = 2025;
		// int len =0, div=1, sum=0;

		// for(int i=num; i>0; i/=10){
		// 	len++;
		// }
		// System.out.println("Length:"+len);

		// if(len%2==0){
		// 	for(int i=1; i<=(len/2); i++){
		// 		div*=10;
		// 	}
		// 	sum = (num/div) + (num%div);
		// 	int sqr = sum * sum;
		// 	System.out.println(num==sqr?num+"Technum:":num+"Not Technum:");
		// }

		//krishnamurti num -- peterson number
		// int num = 145;
		// int dup = num;
		// int sum =0; 

		// for(int i=num; i>0; i/=10){
		// 	int rem = num%10;
		// 	int fact =1;
		// 	for(int j=1; j<=rem; j++){
		// 		fact = fact * j;
		// 	}

		// 	sum+=fact;
		// 	num/=10;
		// }
		// System.out.println(sum);
		// if(dup==sum){
		// 	System.out.println("krishnanum:");
		// }
		// else{
		// 	System.out.println("Not krishnanum:");
		// }

		//Armstrong number
		// int num = 153;
		// int dup = num;
		// int len =0;
		// int sum =0;
		// for(int i=num; i>0; i/=10){
		// 	len++;
		// }
		// System.out.println("length:"+len);

		// while(num>0){
		// 	int rem = num%10;
		// 	int pow = 1;
		// 	for(int i=1; i<=len; i++){
		// 		pow = pow*rem;
		// 	}
		// 	sum+=pow;
		// 	num/=10;
		// }
		// System.out.print(sum);
		// if(sum==dup){
		// 	System.out.println("ArmstrongNum:");
		// }
		// else{
		// 	System.out.println("Not ArmstrongNum:");
		// }


		//emirp number
		// 17 - 71--prime
		// int num = 17;
		// int rev =0;
		// boolean flag = true;
		// //reverse
		// for(int i= num; i>0; i/=10){
		// 	rev = rev * 10 + i%10;
		// }
		// System.out.println(num+":"+rev);

		// //num is prime or not
		// for(int i =2; i<num; i++){
		// 	if(num%i==0){
		// 		flag = false;
		// 		break;
		// 	}
		// }

		// //rev is prime or not
		// for(int i=2; i<rev; i++){
		// 	if(rev%i==0){
		// 		flag = false;
		// 		break;
		// 	}
		// }

		// if(flag){
		// 	System.out.println("EmirpNum:");
		// }
		// else{
		// 	System.out.println("Not EmirpNum:");
		// }
	}
}