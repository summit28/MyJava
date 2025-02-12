class Area_And_Perimeter_Of_Circle 
{
	public static void areaofperimeter(float r){
		final float pi = 22/7f;
		
		float area = pi * (r* r);
		float Perimeter = 2 * pi * r;
		
		System.out.println("Area Of Circle is: "+ area);
		System.out.println("Perimeter Of Circle is: "+ Perimeter);
	}
	public static void main(String[] args) 
	{
		areaofperimeter(4f);
	}
}
