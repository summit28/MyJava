import java.util.Scanner;
class Restraunt{
	static String name;//null
	static long contact;//null
	static String address;//null
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(; ;){
			System.out.println();
			System.out.println("JAVA KA DHABA");
			System.out.println();
			System.out.println("1. CREATE ACCOUNT");
			System.out.println("2. EXSISTING USER");
			System.out.println();
			System.out.print("Enter an option: ");
			int opt = sc.nextInt();
			switch(opt){
			case 1: createAccount(sc); break;
			case 2: login(sc); break;
			default :System.out.println("INVALID INPUT");
				break;
			}
		}
	}
	public static void createAccount(Scanner sc){
		System.out.println("****REGISTRATION");
		System.out.println();
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Phone: ");
		contact = sc.nextLong();
		sc.nextLine();
		System.out.print("Address: ");
		address = sc.nextLine();
		System.out.println();
		System.out.println("ACCOUNT CREATED SUCCESSFULLY");
	}

	public static void login(Scanner sc ){
		if(name==null){
			System.out.println("CREATE YOUR ACCOUNT FIRST");
			return ;
		}
		System.out.println("***Login***");
		System.out.println();

		for(int attempt = 3; attempt>=1; attempt--){
			System.out.print("USERNAME: ");
			String username = sc.next();
			System.out.print("Password:");
			long phone = sc.nextLong();
			System.out.println(); 
			if(name.equals(username) && contact==phone){
				homepage(sc);
			}
			else{	
				System.out.println("INVALID CREDIENTIAL");
				System.out.println("ATTEMPT LEFT: "+ (attempt-1));
				System.out.println();
			}
		}
		System.out.println("Thank Your & Never Visit Again");
		System.exit(0); // teminate the execution
	}

	public static void homepage(Scanner sc ){
		System.out.println("Home Page:");
		System.out.println();
		System.out.println("1.Menu");
		System.out.println("2.Order");
		System.out.println("3.Table Booking");
		System.out.println("4.Logout");
		System.out.println();
		System.out.print("Enter an option:");
		int opt = sc.nextInt();

		switch(opt){
		// case 1: menu();break;
		}
	}
}