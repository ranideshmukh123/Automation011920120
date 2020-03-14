package constructor;

public class mobileuser {

	public static void main(String[] args) {
		
		Mobile samsung= new Mobile();
		samsung.colour = "White";
		samsung.model = "samsung galaxy";
		samsung.height = 5;
		samsung.price =12000;
		samsung.feature();
		
		
		
		Mobile redimi= new Mobile();
		redimi.colour = "Black";
		redimi.model = "samsung note pro";
		redimi.height = 6;
		redimi.price =14000;
		redimi.feature();
		
		
		
		Mobile Nokia= new Mobile();
		Nokia.colour = "Red";
		Nokia.model = "Nokia plus";
		Nokia.height = 4;
		Nokia.price =13000;
		Nokia.feature();
		

	}

}
