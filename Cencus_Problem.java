class Cencus_Problem
{
	public static void main(String[] args) 
	{
		long currpop = 312032486;
		final long sec = (365*24*60*60)*5;
		System.out.println(sec);
		
		long onebirth = sec/7;
		long onedeath = sec/13;
		long onenewimm = sec /45;
		
		long popnxtfiveyear = (currpop + onebirth - onedeath + onenewimm);
		System.out.println(currpop);
		System.out.println(popnxtfiveyear);
	}
}
`