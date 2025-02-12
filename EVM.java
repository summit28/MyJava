import java.util.*;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bjp=0, cng=0, ss=0, app=0;
		System.out.println("");
		System.out.println("****Welcome****");
		System.out.println("");
		System.out.print("ENTER THE POPULATION: ");
		int Population = sc.nextInt();
		
		for(int i=1; i<=Population; i++){
			System.out.println("");
			System.out.println("LIST OF PARTIES: ");
			System.out.println("");
			System.out.println("1.BJP");
			System.out.println("2.CONGRESS");
			System.out.println("3.SHIV SENA");
			System.out.println("4.APP");
			System.out.println("");
			System.out.print("ENTER THE OPTION:");
			int opt = sc.nextInt();
			if(opt>=1 && opt<=4){
				if(opt==1){
					bjp++;
				System.out.println("ACHE DIN AYENGE:");
				}
				if(opt==2){
					cng++;
				System.out.println("BHARAT TODO:");
				}
				if(opt==3){
					ss++;
				System.out.println("JAY MAHARASHTRA:");
				}
				if(opt==4){
					app++;
				System.out.println("MUZE AAJAD KAR DO:");
				}
			}
		}
			if(bjp>=cng && bjp>=ss && bjp>=app){
				System.out.println("BJP HAS WON THE ELECTION BY "+bjp+" VOTES");
			}
			else if(cng>=bjp && cng>=ss && cng>=app){
				System.out.println("CNG HAS WON THE ELECTION BY "+cng+" VOTES");
			}
			else if(ss>=bjp && ss>=cng && ss>=app){
				System.out.println("SS HAS WON THE ELECTION BY "+ss+" VOTES");
			}
			else if(app>=cng && app>=ss && app>=bjp){
				System.out.println("APP HAS WON THE ELECTION BY "+app+" VOTES");
			}
	}
}
