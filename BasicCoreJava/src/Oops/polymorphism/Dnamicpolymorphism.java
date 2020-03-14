package Oops.polymorphism;

import Oops.inheritance.Mobile;
import Oops.inheritance.Smartphone;
import Oops.inheritance.Telephone;

public class Dnamicpolymorphism {

	public static void main(String[] args) {
		
		Telephone phone= new Mobile();
		
		
		
		phone= new Mobile();
		phone= new Telephone();
		phone= new Smartphone();
		
		
		phone.calling();
	
	}

}
