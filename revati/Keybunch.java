
class Keybunch{
	String things;
	Key key;
	
	public Keybunch(String things,Key key){
		this.things=things;
		this.key=key;
		
	}
	
	public void print(){
		
		System.out.println("Keybunch things:"+this.things);
		key.display();
	}
}