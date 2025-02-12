import java.util.*;
class Sqrt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		boolean flag = false;
		for(int i=1; i*i<=num; i++){
			if(i*i==num){
				flag = true;
				System.out.println(i+" is a perfect square: ");
				break;
			}
			if(i*i>num){
				break;
			}
		}
		if(!flag){
			System.out.println("Num is not a perfect square: ");
		}
	}
}