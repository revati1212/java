class Shop {
	public static void medicine(String name, String  manfdate,  float price, int quantity){
		System.out.println("medicine name:"+ name);
		System.out.println("medicine manf date:" +manfdate);
		System.out.println("medicine price:" +price);
		System.out.println("medicine quantity:"+quantity);
		
		
	}
	public static void juice(String name, String brand, String flavour, float price, int quantity){
		System.out.println("juice name:"+name);
		System.out.println("juice brand:"+brand);
		System.out.println("juice flavour:"+flavour);
		System.out.println("juice price:"+price);
		System.out.println("juice quantity:"+quantity);
		
	}
}
	if(medicines.length==4){
			String name =medicines[0];
			String manfdate=medicines[1];
			String price=medicines[2];
			String quantity=medicines[3];
			
			 float converedprice = Float.parseFloat(price);
			 int converedquantity=Integer.parseInt(quantity);
			 
			 JuiceShop.medicine(name,manfdate,converedprice,converedquantity );
			 
			 
		}
		else if  (medicines.length==5){
			String name =medicines[0];
			String brand =medicines[1];
			String flavour=medicines[2];
			String price =medicines[3];
			String quantity=medicines[4];
			
			float converedprice = Float.parseFloat(price);
			 int converedquantity=Integer.parseInt(quantity);
			 
			 JuiceShop.juice(name,brand,flavour,converedprice,converedquantity);
		}
		
	}
}