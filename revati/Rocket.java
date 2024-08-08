class Rocket {
    String country;
    int speed;
    int fuelCapacity;
    int noOfThrusters;

    public void rocket()
	{
		System.out.println("country :"+country);
		System.out.println("speed :"+speed);
		System.out.println("fuelCapacity :"+fuelCapacity);
		System.out.println("noOfThrusters :"+noOfThrusters);
	}
    void setCountry(String country) {
        this.country = country;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    void setNoOfThrusters(int noOfThrusters) {
        this.noOfThrusters = noOfThrusters;
    }

    
}