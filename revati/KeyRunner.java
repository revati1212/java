
class KeyRunner{
	
	public static void main(String[] args){
		
		
		Key key=new Key(6,"sony");
		Keybunch keybunch=new Keybunch("xyz",key);
		keybunch.print();
		System.out.println("-------------------");
		
		Key key1=new Key(4,"Keys");
		Keybunch keybunch1=new Keybunch("chain",key1);
		keybunch1.print();
	}
	
}