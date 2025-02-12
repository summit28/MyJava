import java.util.*;
class CurrencyConverter 
{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("CURRERNCY CONVERTER: ");
		System.out.println("");
		System.out.print("ENTER THE AMOUNT(INR) : ");
		float inr = sc.nextFloat();
		System.out.println("");
		
		System.out.println("LIST OF CURRENCY");
		System.out.println("1.USD");
		System.out.println("2.EURO");
		System.out.println("3.PAK");
		System.out.println("");
		System.out.print("ENTER THE CORRENCY: ");
		String curr = sc.next().toUpperCase();
		System.out.println("");
		
		float currCurr = 0;
		if(curr.equals("USD")){
			float Currcurr = inr*0.0115f;
			System.out.println(inr +" INR : "+ Currcurr+ " USD");
		}
		else if(curr.equals("EURO")){
			//float Currcurr = inr/90.25f;
			float Currcurr = inr*0.0110f;
			System.out.println(inr +" INR : "+ Currcurr+ " EURO");
		}
		else if(curr.equals("PAK")){
			float Currcurr = inr*3.23f;
			System.out.println(inr +" INR : "+ Currcurr+ " PAK");
		}
		else{
			System.out.println("Invalid Input:");
		}

	}
}
