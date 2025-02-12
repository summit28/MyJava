import java.util.*;
class Sum{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num = sc.nextInt();
	int sum = 0;
	int temp = num;

	while(num>0){
		int rem = num%10;
		sum += rem;
	num = num /10;
	}
	System.out.println("sum of number is: "+ sum);
	System.out.println("number is: "+ temp);
}
}