import java.util.*;
class EvenSum{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num = sc.nextInt();
	int sum = 0;
	int sum1= 0;
	int temp = num;

	while(num>0){
		int rem = num%10;
		if(rem%2==0){
		sum += rem;
	}
	else if(rem%2!=0){
		sum1= sum1 + rem;
	}
	num = num /10;
	}
	System.out.println("number is: "+ temp);
	System.out.println("sum of Even number is: "+ sum);
	System.out.println("sum of Odd number is: "+ sum1);

}
}