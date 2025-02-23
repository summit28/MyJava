import java.util.*;
class EYcode4{ public static void main(String[] args) {
		//cognizant program
		String str = "B...BB..B.B..B";
		int op = solve(str);
		System.out.println(op);
	}

	public static int solve(String str){
		String [] arr = str.split("\\.+");
		Set<String> set = new LinkedHashSet<String>();
		for(String ele : arr)
			set.add(ele);
		return (set.size());
	}
}