import java.util.*;
class PinGenProgram{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int storepin = 28;
		int secs = 5000;
		outerloop:
		for(; ; ){
			int attempts=3;
			do{
				System.out.print("Enter the pin: ");
				int pin = sc.nextInt();
				if(pin==storepin){
					System.out.println("PHONE UNLOCK: ");
					break outerloop;
				}
				else{
					System.out.println("WRONG PIN: ");
					System.out.println("ATTEMPTS LEFT"+(attempts-1));
				}
				attempts--;
			}while(attempts>=1);

			System.out.println();
			System.out.println("PHONE IS DISABLE FOR: "+(secs/1000)+"seconds");
			Thread.sleep(secs);
			secs*=2;
			System.out.println();
 
		}
	}
}