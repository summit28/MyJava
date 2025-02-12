import java.util.*;
class Power{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	System.out.print("Enter the power:");
	int pow = sc.nextInt();
	int op=1;
	for(int i =1; i<=pow; i++){
	   op = op*num;
	}
	System.out.println(num+"^"+pow+"="+op);
	System.out.println((int)Math.pow(num,pow));
}
}