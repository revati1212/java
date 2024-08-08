class Projector {
    String company;
    String type;
    String color;
    double weight;

    public void projector()
	{
		System.out.println("company :"+company);
		System.out.println("type :"+type);
		System.out.println("color :"+color);
		System.out.println("weight :"+weight);
	}
    void setCompany(String company) {
        this.company = company;
    }

    void setType(String type) {
        this.type = type;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    
}