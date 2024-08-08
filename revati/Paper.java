class Paper{
    double thickness;
    String size;
    String quality;
    String color;

    public void book()
	{
		System.out.println("thickness :"+thickness);
		System.out.println("size :"+size);
		System.out.println("quality :"+quality);
		System.out.println("color :"+color);
	}
    void setThickness(double thickness) {
        this.thickness = thickness;
    }

    void setSize(String size) {
        this.size = size;
    }

    void setQuality(String quality) {
        this.quality = quality;
    }

    void setColor(String color) {
        this.color = color;
    }

    
}