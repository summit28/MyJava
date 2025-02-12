import java.util.*;
class Table 
{
	public static void main(String[] args) throws InterruptedException 
		{
		//Multiplication Table
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.print("Enter the range: ");
		int range = sc.nextInt();
		for(int i=1; i<=range; i++){
			System.out.println(num+"X"+i+"="+(num*i));
		}
		*/
		//A C F J O U series
		/*int a =1;
		for(char ch ='A'; ch<='Z'; ch+=a){ //ch = ch + a; //ch = A + 2 & so on...
			System.out.print(ch+" ");	
			a++; //2 3 4 5 6 7
		}
		*/
		
		//Print char from user
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String str = sc.next().toUpperCase();
		
		for(int i=0; i<=str.length()-1; i++){
			char ch = str.charAt(i);
			System.out.println(ch);
			Thread.sleep(2000);
		}
		*/
		
		//print all even no from 1 to 100
		/*for(int i=1; i<=100; i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		*/
		
		//print all odd no from 1 to 100
		/*for(int i=1; i<=100; i++){
			if(i%2!=0){
				System.out.print(i+" ");
			}
		}
		*/
		//print all vowels from username
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String str = sc.next().toLowerCase();
		for(int i=0; i<=str.length()-1; i++){
			char ch = str.charAt(i);
			if(ch== 'a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
				System.out.println(ch);
			}
		}
	}
}
