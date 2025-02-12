import java.util.*;
class School_Application 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("List of choice:");
		System.out.println("1.Monday");
		System.out.println("2.Tuesday");
		System.out.println("3.Wednesday");
		System.out.println("4.Thursday");
		System.out.println("5.Friday");
		System.out.println("6.Saturday");
		System.out.println("7.Sunday");
		System.out.print("Enter the Choice: ");
		int choice = sc.nextInt();
		switch(choice){
			case 1:{
				System.out.println("Learn Science: ");
				break;
			}
			case 2:{
				System.out.println("Practice Geometry: ");
				break;
			}
			case 3:{
				System.out.println("Explore History: ");
				break;
			}
			case 4:{
				System.out.println("Practice Algebra: ");
				break;
			}
			case 5:{
				System.out.println("Practice to Speak in English: ");
				break;
			}
			case 6:{
				System.out.println("Learn something new: ");
				break;
			}
			case 7:{
				System.out.println("Chill today is sunday: ");
				System.out.println("Play cricket: ");
				break;
			}
			default:{
				System.out.println("Go to School: ");
				break;
			}
		}
	}
}
