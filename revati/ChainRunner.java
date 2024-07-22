class ChainRunner{
   public static void main(String[] args)
   {
	   System.out.println("Running main in ChainRunner");
	   int carat=Chain.carat();
	   System.out.println("carat:"+carat);
	   double price=Chain.costPerGram();
	   System.out.println("price per gram:"+price);
	   String types=Chain.type();
	   System.out.println("type of chain:"+types);
	   String qualiti=Chain.quality();
	   System.out.println("quality of chain:"+qualiti);
	   byte gms=Chain.quantity();
	   System.out.println("quantity of chain in grams:"+gms);
	   byte waste=Chain.wastage();
	   System.out.println("wastage in %:"+waste);
	   int service=Chain.serviceCost();
	   System.out.println("Service cost per gram:"+service);
	   byte gstCharges=Chain.gst();
	   System.out.println("GST price in %:"+gstCharges);
   }
}