class HealthRunner
{
	public static void main(String[] args)
	{
        char check=Health.check("good");
		System.out.println("check:"+check);
		char check=Health.check("not good");
		System.out.println("check:"+check);
		}
		}