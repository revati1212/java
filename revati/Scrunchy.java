class Cars{
	public static void bmw()
	{
		System.out.println("running bmw in cars");
	}
	public static void tata()
	{
		System.out.println("running tata in cars");
	}
	public static void mahendra()
	{
		System.out.println("running mahendra in cars");
		tata();
	}
	public static void sony()
	{
		System.out.println("running sony in cars");
		mahendra();
	}
}