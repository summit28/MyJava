class Volume_Of_Cylinder 
{
	public static void Volume_Of_Cylinder(float r,float l){
		final float pi = 22/7f;
		float area = pi * r * r;
		float volume = area * l;
		System.out.println("Area Of Cyclinder: " + area);
		System.out.println("Volume Of Cyclinder: " + volume);
	}
	public static void main(String[] args) 
	{
	Volume_Of_Cylinder(5.5f,12f);
	}
}
