class convertbintodec{
	public static void main(String[] args) {
		int num =10;

		String bin = Integer.toBinaryString(num);
		System.out.println(num+":"+bin);

		//convert bintodec
		int num2 = Integer.parseInt(bin,2);
		System.out.println("num2:"+num2);
	}
}