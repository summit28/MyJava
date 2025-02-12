import java.util.*;
class Switch1 
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		int ip = sc.nextInt();
		switch(ip){
			case 1: {
				System.out.println("From case 1: ");
				break;
			}
			case 2:{
				System.out.println("From case 2: ");
					break;
			}
			case 3:{
				System.out.println("From case 3: ");
				break;
			}
			default :{
				System.out.println("Invalid Input: ");
				break;
			}
		}
	}
}
