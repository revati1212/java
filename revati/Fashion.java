//A.Write a class with below methods
//1.Method to take code and return country: 5 condition


class Cloths
{
	public static String country (int code)
	{
		System.out.println("running code in world");
		System.out.println("code :"+code);
		if(code==212)
		{
			System.out.println("country is Morocco");
			return "Morocco";
		}
		else if(code==420)
		{
			System.out.println("country is Czech Republic");
			return "Czech Republic";
		}
		else if (code== 82)
		{
			System.out.println("country is South Korea");
			return "South Korea";
		}
		else if (code== 971)
		{
			System.out.println("country is UAE");
			return "UAE";
		}
		else{
			System.out.println(0);
			return "country not found";
			
		}
	}
	