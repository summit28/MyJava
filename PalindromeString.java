class PalindromeString{
	public static void main(String[] args) {
		//reverseString
		String str = "madam";
		String temp = str;
		String rev ="";

		for(int i=0; i<str.length(); i++){
			rev = str.charAt(i)+rev;
		}
		System.out.println(temp+" : "+rev);

		//compare
		if(temp.equals(rev)){
			System.out.println("String is Palindrome: ");
		}
		if(!(temp.equals(rev))){
			System.out.println("String is not Palindrome: ");
		}
	}
}