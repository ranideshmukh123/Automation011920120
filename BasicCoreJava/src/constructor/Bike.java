package constructor;

public class Bike {

	String colour;
	int speed;
	String model;
	int average;
	static int wheels=2;
	
	
	public void feature() {
	
	System.out.println(colour+" "+model+" Bike has "+ wheels +"wheels and its average speed is"+ speed +" and average is"+ average +" kml");
	
	
}
public Bike(String colour,
		int speed,
		String model,
		int average)
{
	this.colour=colour;
    this.model=model;
    this.speed=speed;
     this.average=average;

	}
}