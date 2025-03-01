import java.util.Scanner;
class Currencycon{
	public static void main(String[] args) {
		System.out.println("Main start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		double rup = sc.nextDouble();
		repTodollar(rup);
		System.out.println("Main end");
	}

	public static void repTodollar(double rup){
		System.out.println("dollor start");
		double dollor = rup/87.20;
		System.out.println(dollor);
		dollorToeuro(dollor);
		System.out.println("dollor end");
	}

	public static void dollorToeuro(double dollor){
		System.out.println("Euro start");
		double euro = dollor*0.95;
		System.out.println(euro);
		euroTordirhams(euro);
		System.out.println("Euro end");
	}

	public static void euroTordirhams(double euro){
		System.out.println("dirhams star");
		double dirhams = euro*3.85;
		System.out.println(dirhams);
		System.out.println("dirhams end");
	}
}