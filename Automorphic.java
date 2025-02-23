import java.util.*;
class Automorphic{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int len =0;		
		int div =1; 

		for(int i=num; i>0; i/=10){
			len++;
		}
		// System.out.println(len);

		for(int i=1; i<=len; i++){
			div*=10;
		}
		System.out.println("div:"+div);
		if(num==((num*num)%div)){
			System.out.println(num+" is a Automorphic Number:");
		}
		else{
			System.out.println(num+" is not a Automorphic Number:");
		}
	}
}