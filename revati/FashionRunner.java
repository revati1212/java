class ClothsRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main");
		String Ccode=Cloths.country (420);
		System.out.println("Ccode :"+Ccode);
		String CCode=Cloths.country (111);
		System.out.println("CCode :"+CCode);
		double itemName=World.price("Mobile");
		System.out.println("itemName :"+itemName);
		double itemmName=Cloths.price("Chair");
		System.out.println("itemmName :"+itemmName);
		String movie= Cloths.producerName("Carolina");
		System.out.println("movie :"+movie);
		String moviez= Cloths.producerName("Pranay Reddy");
		System.out.println("moviez :"+moviez);
	}
}
