import java.util.*;
class test2 {
    public static void main(String[] args) {
        //basic programs
        //Evenodd Number
        // int num = 10;
        // if(num%2==0){
        //     System.out.print("EvenNum:");
        // }
        // else{
        //     System.out.print("Oddsum:");
        // }

        //Evenodd Num without modulus
        // int num=15;
        // if(((num/2)*2) == num || num==2){
        //     System.out.println("Evennum:");
        // }
        // else{
        //     System.out.println("Oddnum:");
        // }

        //largest of three and smallest of three
        // int a=2722;
        // int b=457;
        // int c=78;

        // if(a>b && a>c){
        //     System.out.println(a+"largestnum:");

        // }
        // else if(b>a && b>c){
        //     System.out.println(b+"largestnum:");
        // }
        // else{
        //     System.out.println(c+"largestnum:");
        // }

        //check weather enter char are vowels or cont
        // char ch = 'b';
        // if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        //     System.out.print("vowels:");
        // }
        // else{
        //     System.out.println("cont");
        // }

        //optimize prime number
        // int num = 5;
        // int dem = 2;

        // while(dem<num){
        //     if(num%dem==0){
        //         break;
        //     }
        //     dem++;
        // }

        // if(num==dem){
        //     System.out.println("PrimeNumber:");
        // }
        // else{
        //     System.out.println("NotPrimeNumber:");
        // }


        //reverse a 3 digit number
         // int num =1234;
         // int rem =0;
         // for(int i=num; i>0; i/=10){
         //    rem = i%10;
         //  System.out.print(rem);
         // }   


        //char is UC or LC
        // char ch = 'A';
        // if(ch>='a' && ch<='z'){
        //     System.out.println("char is lowercase:");
        // }
        // else if(ch>='A' && ch<='Z'){
        //     System.out.println("char is UpperCase:");
        // }
        // else{
        //     System.out.println("Invalid Input:");
        // }

        //Number Programs
        //sum of digit
        // int num = 1234;
        // int rem=0, sum=0;

        // for(int i=num; i>0; i/=10){
        //     rem = i%10;
        //     sum+=rem;
        // }
        // System.out.println(sum);

        //fact of number
        // int num = 5;
        // int fact =1;
        // for(int i=1; i<=num; i++){
        //     fact*=i;
        // }
        // System.out.println(fact);

        //find factors of number
        // int num = 10;
        // int fact =1;
        // for(int i=1; i<=num; i++){
        //     if(num%i==0){
        //         System.out.print(i+" ");
        //     }
        // }

        //sum of factors of num
        // int num = 10;
        // int fact =1;
        // int sum=0;
        // for(int i=1; i<=num; i++){
        //     if(num%i==0){
        //         sum+=i;
        //         System.out.println(i+" ");
        //     }
        // }
        // System.out.println("sum:"+sum);

        //perfect square root of number
        // int num =36;
        // boolean flag = false;
        // for(int i=1;i*i<=num;i++){
        //     if(i*i==num){
        //      flag = true;   
        //     }
        // }

        // if(flag){
        //     System.out.println(num+ " is a perfect square number:");
        // }
        // else{
        //     System.out.println(num+ " is not perfect square number:");
        // }

        //power number
        // int num =2;
        // int pow =2;
        // for(int i=1;i<=pow;i++){
        //     num*=i;
        // }
        // System.out.println(num);

        //reverse number
        // int num =1234;
        // int rem =0;
        // for(int i=num; i>0; i/=10){
        //     rem = i%10;
        //     System.out.print(rem);
        // }

        //palindrome num --rev
        // int num =121;
        // int rem =0;
        // int rev =0;
        // for(int i=num; i>0; i/=10){
        //     rev = rev * 10 +  i%10;
        // }

        // if(rev==num){
        // System.out.print(num+" Palindrome:");
        // }
        // else{
        //     System.out.println(num+" Not Palindrome:");
        // }

        //

        //reverse a string
        // String str = "Hello";
        // for(int i=str.length()-1; i>=0; i--){
        //     char ch = str.charAt(i);
        //     System.out.print(ch);
        // }

        //palindrome string -- rev
        // String str = "madam";
        // String rev = "";
        // for(int i=0; i<str.length(); i++){
        //     rev = str.charAt(i)+rev;
        // }

        //     if(str.equals(rev)){
        //         System.out.println(rev+" is Palindrome:");
        //     }
        //     else{
        //         System.out.println(rev+" is not Palindrome:");
        //     }

        //con num into words
        // int num = 10;
        // String words = "";
        // int rem=0;
        // for(int i=num; i>0; i/=10){
        //     rem = i%10;

        //     switch(rem){
        //     case 0: words = "Zero " + words; break;
        //     case 1: words = "One " + words; break;
        //     }
        // }
        // System.out.println(num);
        // System.out.println(words);

        //find prime fact of num
        // int num = 15;
        // int fact =1;
        // int dem =2;
        // for(int i=2; i<num; i++){
        //     if(num%i==0){
        //         System.out.print(i+" ");
        //         }
        //     }

        //find highest digit from a num
        // int num =123;
        // int max =0;
        // for(int i=num; i>0;i/=10){
        //     int dgt = i%10; //dgt==rem
        //     if(max<dgt){
        //         max = dgt;
        //     }
        // }
        // System.out.print("Largest digit is:"+max);

        //find smallest digit form a num
        // int num = 123;
        // int min = 9;
        // for(int i=num; i>0; i/=10){
        //     int dgt = i%10;
        //     if(min>dgt){
        //         min = dgt;
        //     }
        // }
        // System.out.println("Smallest digit is: "+min);

        
        
    }

}
    

