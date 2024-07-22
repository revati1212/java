class Buy{
public static void product(String brand,double price)
{
System.out.println("running product in buy");
System.out.println("brand:"+brand);
System.out.println("price:"+price);

if (price >100 && price<= 500)
{
           System.out.println("price is valid");
        }
		else
			{
           System.out.println("price is invalid");
        }
}

public static void product(String name,int quantity,String quality,double price)
{
System.out.println("running product in buy with four parameters");
System.out.println("name:"+name);
System.out.println("quantity:"+quantity);
System.out.println("quality:"+quality);
System.out.println("price:"+price);

if (quantity >70 && quantity<= 20)
{
           System.out.println("quantity is valid");
        }
		else
			{
           System.out.println("quantity is invalid");

			}
			}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
{
System.out.println("running bookMovieTicket in buy with four parameters");
System.out.println("name:"+name);
System.out.println("theaterName:"+theaterName);
System.out.println("quantity:"+quantity);
System.out.println("price:"+price);

if (quantity >15 && quantity<= 200)
{
           System.out.println("price is valid");
        }
		else
			{
           System.out.println("price is invalid");

			}
			}
			public static void buyEgg(int total,double priceEgg)
{
System.out.println("running buyEgg in buy");
System.out.println("total:"+total);
System.out.println("priceEgg:"+priceEgg);

if (priceEgg >6.5 && priceEgg<= 8.5)
{
           System.out.println("price is valid");
        }
		else
			{
           System.out.println("price is invalid");
        }
}
			
public static void buyShampoo(int quantityInMl,double price,String brand,String ManfDate)
{
System.out.println("running buyShampoo in buy");
System.out.println("quantityInMl:"+quantityInMl);
System.out.println("price:"+price);
System.out.println("brand:"+brand);
System.out.println("ManfDate:"+ManfDate);

if (quantityInMl >5 && quantityInMl<= 10)
{
           System.out.println("buyShampoo is valid");
        }
		else
			{
           System.out.println("buyShampoo is invalid");
        }
}
public static void buyCake(char size,String type,String flavour,double cost,int quantity)
{
System.out.println("running buyCake in buy");
System.out.println("size:"+size);
System.out.println("type:"+type);
System.out.println("flavour:"+flavour);
System.out.println("cost:"+cost);
System.out.println("quantity:"+quantity);

if (cost >15.0 && cost<= 25.0)
{
           System.out.println("buyCake is valid");
        }
		else
			{
           System.out.println("buyCake is invalid");
        }
}	
public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddisksize,int ramSize)
{
System.out.println("running buyLaptop in buy");
System.out.println("brand:"+brand);
System.out.println("serialNo:"+serialNo);
System.out.println("price:"+price);
System.out.println("batteryCapacity:"+batteryCapacity);
System.out.println("os:"+os);
System.out.println("harddisksize:"+harddisksize);
System.out.println("ramSize:"+harddisksize);

if (price >15000.0 && price<= 25000.0)
{
           System.out.println("buyLaptop is valid");
        }
		else
			{
           System.out.println("buyLaptop is invalid");
        }
}	
public static void buySmartWatch(String brand,double price,int color,char type,int mode)
{
System.out.println("running buySmartWatch in buy");
System.out.println("brand:"+brand);
System.out.println("color:"+color);
System.out.println("type:"+type);
System.out.println("mode:"+mode);


if (price >3000.0 && price<= 5000.0)
{
           System.out.println("buySmartWatch is valid");
        }
		else
			{
           System.out.println("buySmartWatchis invalid");
        }
}	
}



	




