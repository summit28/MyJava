import java.util.*;
class Logical_Conditional_Operator 
{
	public static void main(String[] args) 
	{
	//upperCase();
	//lowerCase();
	//digitornot();	
	//charcter(); // try 4 char also
	//hitwofive();
	//deloitte();
	//vowels();
	//passfail();
	//Seasons();
	//Calculator();
	taxCalculator();
	}
	
	public static void upperCase(){
		char ch = 'A';
		System.out.println((ch>=65 && ch<=90)?(ch + " is a UpperCase char"):(ch + " is a constant"));
	}
	public static void lowerCase(){
		char ch = 'a';
		System.out.println((ch>=96 && ch<=122)?(ch + " is a LowerCase char"):(ch + " is a constant"));
	}
	
	public static void digitornot(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a char : ");
		char ch = sc.next().charAt(0);
		
		System.out.println((ch>='0' && ch<='9')?(ch+ " is a digit"):(ch+ " is a not a digit"));
	}
	public static void charcter(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a char : ");
		char ch = sc.next().charAt(0);
		
		System.out.println((ch>='A' && ch<='Z' || ch>='a' && ch<='z')?
							((ch>='a' && ch<='z')?(ch+ " is a lowercase"):(ch+ " is a const")):
							((ch>='0' && ch<='9')?(ch+ " is a digit"):(ch+ "is a const")));
	}
	public static void hitwofive(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = s.nextInt();				  
		System.out.println((num==0)?("__"):((num%2==0 && num%5==0)?(num+"hitwofive"):((num%5==0)?
							(num+"hifive"):((num%2==0)?(num+"hitwo"):("__")))));
		
		
	}
	public static void deloitte(){
		int student = 10; //5
		int count = 15; //2
		System.out.println((count%student)+1); //6 //3
	}
	public static void vowels(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a char: ");
		char ch = sc.next().charAt(0);
		System.out.println(((ch == 'a' || ch == 'e' || ch == 'i') || ch == 'o' || ch == 'u')?
					      (ch+ " is vowel"):(ch + " is const"));
	}
	
	public static void passfail(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int marks = sc.nextInt();
		int per = (marks*100)/600;
		System.out.println((marks>0 && marks<600)?((per>=95)?(per + "A Grade"):
						  ((per>=75 && per<95)?(per + "B Grade"):
						  ((per>=60 && per<75)?(per + "C Grade"):
						  ((per>=35 && per<60)?(per + "Your are Pass:"):("Fail"))))):("INVALID INPUT"));
	}
	public static void Seasons(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Month: ");
        String month = sc.next().toUpperCase();
		String str = ((month.equals("OCT") || month.equals("NOV") || month.equals("DEC") || month.equals("JAN")))
			?(month + " is  Winter"):((month.equals("FEB") || month.equals("MAR") || month.equals("APR") || month.equals("MAY"))?
			(month + " is Summer"):((month.equals("JUN") || month.equals("JULY") || month.equals("AUG") || month.equals("SEP")))?
			(month + " is a Monsoon"):("Invalid Input"));
		System.out.println(str);
	}
	public static void Calculator(){
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number1: ");
		float num1 = sc.nextFloat();
		System.out.print("Enter the Number2: ");
		Float num2 = sc.nextFloat();
		System.out.print("Enter the Operator: ");
		char op = sc.next().charAt(0);
		
		float result = (op=='+')?(num1+num2):
					   ((op=='-')?(num1-num2):
					   ((op=='*')?(num1*num2):
					   (op=='/')?(num1/num2):
					   ((op=='%')?(num1%num2):(0.000001f))));
			
		String output= (num1+" "+op+" "+num2+" = "+result);
			
		if(!(result==0.000001f)){
			System.out.println(output);
		}
	}
	public static void taxCalculator(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the income: ");
		double income = sc.nextDouble();
		double tax=0;
		if(income<5_00_000){
			tax = income*0.1;
			System.out.print("10% tax: "+ tax);
		}
		else if(income>=5_00_000 && income<10_00_000){
			tax = income*0.2;
			System.out.print("20% tax: "+ tax);
		}
		else if(income>=10_00_000){
			tax = income*0.3;
			System.out.print("30% tax: "+ tax);
		}
		System.out.println("");

	}
}
