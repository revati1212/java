class Train{
public static void book(String source,String destination)
{
System.out.println("running book in Train with two string parameter");
System.out.println("source"+source);
System.out.println("destination"+destination);
}
public static void book(String source,String destination,int quantity,double price)
{
System.out.println("running book in Train with four string parameter");
System.out.println("source"+source);
System.out.println("destination"+destination);
System.out.println("quantity"+quantity);
System.out.println("price"+price);
}
public static void cancel(int ticketno)
{
System.out.println("running cancel in Train with one string parameter");
System.out.println("ticketno"+ticketno);
}
public static void cancel(String source,String destination)
{
System.out.println("running cancel in Train with two string parameter");
System.out.println("source"+source);
System.out.println("destination"+destination);
}
}