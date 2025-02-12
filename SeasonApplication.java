import java.util.*;
class SeasonApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("List of months: ");
		System.out.println("1.JAN");
		System.out.println("2.FEB");
		System.out.println("3.MAR");
		System.out.println("4.APR");
		System.out.println("5.MAY");
		System.out.println("6.JUN");
		System.out.println("7.JUL");
		System.out.println("8.AUG");
		System.out.println("9.SEP");
		System.out.println("10.OCT");
		System.out.println("11.NOV");
		System.out.println("12.DEC");
		System.out.print("Enter the Month: ");
		int ip = sc.nextInt();
		
		if(ip==11 || ip==12 || ip==1){
			System.out.println("Season is Winter: ");
		}
		else if(ip==2 || ip==3 || ip==4 || ip==5){
			System.out.println("Season is Summer: ");
		}
		else if(ip==6 || ip==7 || ip==8 || ip==9){
			System.out.println("Season is Monsoon: ");
		}
		else if(ip==10){
			System.out.println("Post-monsoon or Autumn: ");
		}
		else{
			System.out.println("Invalid Input: ");
		}
		
	}
}
