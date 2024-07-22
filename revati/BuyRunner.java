class BuyRunner{
public static void main(String[] args)
{
System.out.println("running main in BuyRunner");
Buy.product("toyota",120);
Buy.product("watch",50);
Buy.product("car",20,"high",40.0);
Buy.product("car",200,"high",40.0);
Buy.bookMovieTicket("lovely","global",2,17);
Buy.bookMovieTicket("lovely","global",2,220.0);
Buy.buyEgg(7,7.00);
Buy.buyEgg(7,9.5);
Buy.buyShampoo(7,300,"vatika","10/5/2024");
Buy.buyShampoo(11,300,"vatika","10/05/2024");
Buy.buyCake('m',"chocolate","dark forest",16.0,5);
Buy.buyCake('l',"chocolate","dark forest",27.0,5);
Buy.buyLaptop("Dell",5,18000.0,200,4.5,"linux",25,500);
Buy.buyLaptop("Dell",5,35000.0,200,4.5,"linux",25,500);
Buy.buySmartWatch("omega",4000.0,255,'m',56);
Buy.buySmartWatch("omega",8000.0,255,'m',56);

}
}