 class Health{
 
 public static char Check(String patient)
	{
		System.out.println("running check in Health");
		System.out.println("patient:"+patient);
		if(patient="good")
		{
			System.out.println("patient is healthy");
			return y;
		}
		else if(patient="not good")
		{
			System.out.println("patient is not healthy");
			return n;
		}
		else{
			System.out.println("NO patient FOUND");
			return ;
		}
	}
 }
 