class AnanyaRunner{
	
	public static void main(String[] args){
		
		Knife knife=new Knife(15,3.1);
		Ananya ananya=new Ananya(8660058812,knife);
		ananya.print();
		System.out.println("--------------------");
		Knife knife1=new Knife(10,4.5);
		Ananya ananya1=new Ananya(9988762056,knife1);
		ananya1.print();
	}
}