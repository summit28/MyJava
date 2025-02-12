import java.util.*;
class ReverseString{
	public static void main(String[] args) {
		// String str = "SAM";
		// StringBuffer rev = new StringBuffer(str);
		// System.out.println(rev.reverse());

		// String str = "RAM";
		// String rev = "";
		// for(int i=0; i<str.length(); i++){
		// 	rev = str.charAt(i)+rev;
		// }
		// System.out.println(rev);

		String str = "SHAM";
		String rev ="";
		for(int i=str.length()-1; i>=0; i--){
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}