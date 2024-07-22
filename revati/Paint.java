class Paint{
public static void painter(String brand)
{
System.out.println("running painter in paint with string parameter");
System.out.println("brand"+brand);
}
public static void painter(String brand,String color)
{
	System.out.println("running brand and color parameter in painter");
		System.out.println("brand"+brand);
	System.out.println("color"+color);
}
public static void painter(String brand,double price)
{
System.out.println("running brand and price parameter in painter");
System.out.println("brand"+brand);
	System.out.println("price"+price);	
}
public static void painter(String color,String type,double price)
{
System.out.println("running brand and price parameter in painter");
System.out.println("color"+color);
		System.out.println("type"+type);
	System.out.println("price"+price);	
	}}