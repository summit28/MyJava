import java.util.*;
class Makenoprimeifnot{
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		boolean flag =true;

		for(int i=2; i<num;i++){
			if(num%i==0){
				flag = false;

				num++;
				i=2;
			}
		}
		System.out.println(num);
	}
}