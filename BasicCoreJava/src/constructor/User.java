package constructor;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car ford=new Car();
		ford.average=10;
		ford.colour="White";
		ford.model="polo";
		ford.speed=150;
		
		ford.features();
		
		
		Car maruti=new Car();
		maruti.average=20;
		maruti.colour="Red";
		maruti.model="Baleno";
		maruti.speed=100;
		
		maruti.features();	
		
		
		Car Kia=new Car();
		Kia.average=12;
		Kia.colour="silver";
		Kia.model="seltos";
		Kia.speed=180;
		
		Kia.features();	
			
		Car hyundai= new Car("polar white",140,"Elite",14);
		hyundai.features();
	}

}
