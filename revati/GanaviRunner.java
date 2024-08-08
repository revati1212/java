class GanaviRunner{
	
	public static void main(String[] args){
		
		Clip clip=new Clip("red","butterfly");
		Ganavi ganavi=new Ganavi("ganavi@gamil.com",clip);
		ganavi.print();
		System.out.println("---------------------");
		Clip clip1=new Clip("black","banana");
		Ganavi ganavi1=new Ganavi("ganavi123@gamil.com",clip1);
		ganavi1.print();
	}
}