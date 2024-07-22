class TrainRunner{
public static void main(String[] args)
{
System.out.println("running Train in TrainRunner");
Train.book("bangaluru","bijapur");
Train.book("bangaluru","bijapur",2,503.30);
Train.cancel(99015);
Train.cancel("Hubli","madikeri");

}
}
