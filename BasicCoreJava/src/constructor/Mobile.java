package constructor;

public class Mobile {
	
	String colour;
	String model;
	int height;
	int price;
	
	public void feature() {
		
		System.out.println(colour+" "+model+" mobile has "+ height+"height and its price is "+price );  //concatation
		
		
		
	}
	
	public Mobile(String colour,
			String model,
			int height,
			int price) {
		
		this.colour=colour;
		this.model=model;
		this.height=height;
		this.price=price;
		
		
	}
	
	
	public Mobile() {
		
	}
	

}
