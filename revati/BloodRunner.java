class BloodRunner{
public static void main(String[] args)
{
System.out.println("running main in BloodRunner");
String value=Blood.group();
System.out.println("group return type:"+ value);
String name=Blood.PersonName();
System.out.println("PersonName return type:"+ name);
double cost=Blood.cost();
System.out.println("cost return type:"+ cost);
boolean hospitalTested=Blood.hospitalTested();
System.out.println("hospitalTested return type:"+ hospitalTested);
boolean sickness=Blood.sickness();
System.out.println("sickness return type:"+ sickness);
boolean donate=Blood.donate();
System.out.println("donate return type:"+ donate);




}
}