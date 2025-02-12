import java.util.*;
class LoanCalculator 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****LOAN CALCULATROR");
		System.out.println("");
		System.out.print("ENTER THE AMOUNT: ");
		float amount = sc.nextFloat();
		System.out.print("Enter the Roi: ");
		float roi = sc.nextFloat();
		System.out.print("Enter the tenure(months):");
		int month = sc.nextInt();
		
		//con from months to years
		String str = (month/12)+ "."+(month%12);
		float con = Float.parseFloat(str);
		
		System.out.println("");
		System.out.println("LOAN CALCULATION: ");
		System.out.println("PRICIPAL AMOUNT: "+ amount);
		System.out.println("ROI: "+roi+"%");
		System.out.println("Tenure: "+month+"months");
		
		float intYear = amount*roi/100;
		float totalInter = intYear*con;
		System.out.println("Interest: "+ totalInter);
		float outStanding = amount+totalInter;
		System.out.println("Total Outstanding Amount: " + (outStanding));
		System.out.println("Emi: "+ (outStanding/month)+ "rs");
	}
}
