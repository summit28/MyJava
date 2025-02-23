import java.util.Scanner;
class BouncyNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();

		if(isincresing(num) || isdecresing(num)){
			System.out.println(num+" is not BouncyNumber:");
		}
		else{
			System.out.println(num+" is BouncyNumber:");
		}
		
	}

	public static boolean isincresing(int num){
		String str = Integer.toString(num);
		char ch;
		boolean flag = true;

		for(int i=0; i<str.length()-1; i++){
			ch = str.charAt(i);
			if(ch>str.charAt(i+1)){
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static boolean isdecresing(int num){
		String str = Integer.toString(num);
		char ch;
		boolean flag = true;

		for(int i=0; i<str.length()-1; i++){
			ch = str.charAt(i);
			if(ch<str.charAt(i+1)){
				flag = false;
				break;
			}
		} 
		return flag;
	}
}