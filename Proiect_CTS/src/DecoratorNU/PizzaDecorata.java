package DecoratorNU;

import java.awt.font.NumericShaper;
import java.util.ArrayList;

import SimpleFactory.Produs;

public class PizzaDecorata  extends APizzaDecorata{

	
	Pizza2 p;
	

	public PizzaDecorata(IPizza iPizza) {
		super(iPizza);
	}

	
	@Override
	public float fctPretPizza() {
		// TODO Auto-generated method stub
		return p.pret=p.pret+p.pret_extra;
	}

	@Override
	public String getNume_pizza() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getPret_extra() {
		// TODO Auto-generated method stub
		return getPret_extra();
	}

	@Override
	public int getNr_ingrediente() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fct_nr_ingrediente() {
		// TODO Auto-generated method stub
		System.out.println("pizza decorata nr ingrediente schimbat");
		return getNr_ingrediente();
		
	}

	
	
	

}
