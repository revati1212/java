class Chocolate {
    String brand;
    double price;
    String flavour;
    String size;

	public void choco()
	{
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("flavour :"+flavour);
		System.out.println("size :"+size);
	}
    
    void setBrand(String brand) {
        this.brand = brand;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    void setSize(String size) {
        this.size = size;
    }

   
}