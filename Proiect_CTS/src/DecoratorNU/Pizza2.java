package DecoratorNU;

import java.util.ArrayList;
import java.util.List;

import SimpleFactory.Produs;

public class Pizza2   implements IPizza {
	
	String nume_pizza;
	float pret_extra;
	int nr_ingrediente;
	
	float pret =10;
	String ingredientExtra;
	ArrayList<Pizza2> listaPizza;
	ArrayList<String> listaIngrediente;

	public Pizza2(String nume_pizza, float pret_pizza,int nr_ingrediente) {
		super();
		this.nume_pizza = nume_pizza;
		this.pret_extra = pret_pizza;
		this.nr_ingrediente=nr_ingrediente;
		
	}

	public String getNume_pizza() {
		return nume_pizza;
	}

	public float getPret_extra() {
		return pret_extra;
	}

	public int getNr_ingrediente() {
		return nr_ingrediente;
	}

	

	public float fctPretPizza()
	{
			return pret = pret+pret_extra;
	}


	
}

