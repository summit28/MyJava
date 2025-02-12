class Avg_Speed_In_Mile 
{
	public static void avgspeddinmile(){
		//1m = 1.6km
		//1km = 0.625m
		float kminmiles = 14f * 0.625f;
		float time = 45f/60f + 30/60*60f;
		//avg = distance / time;
		float avg = kminmiles/time;
		System.out.println(avg);
		
	}
	public static void main(String[] args) 
	{
		avgspeddinmile();
	}
}
