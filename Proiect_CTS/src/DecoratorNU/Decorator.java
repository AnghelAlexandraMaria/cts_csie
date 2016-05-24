package DecoratorNU;

import DecoratorNU.Pizza2;

public class Decorator {

	 public static void main(String[] args) {
	        
	        IPizza ipizza = new Pizza2("pizza", 10, 3);
	        APizzaDecorata apizzadecorata = new PizzaDecorata(ipizza);
	      
	        apizzadecorata.getNr_ingrediente();
	        apizzadecorata.fctPretPizza();
	        
	    }
}
