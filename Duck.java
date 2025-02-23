import java.util.Scanner;
class Duck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int cnt=0;

		String str = num+"";
		System.out.println(str);

		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			// System.out.println(ch);
			if(ch=='0'){
				cnt++;
			}
		}

			if(cnt>=1){
				System.out.println(num+" is Duck Number:");
			}
			else{
				System.out.println(num+" is not Duck Number:");
			}

	}
}