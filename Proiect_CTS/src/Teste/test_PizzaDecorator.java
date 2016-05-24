package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import DecoratorNU.Pizza2;
import SimpleFactory.Produs;
import SimpleFactory.ProdusFactory;
import SimpleFactory.Produse;

public class test_PizzaDecorator {

	@Test
	public void test_decorator()
	{
		 Produs prod;
	        ProdusFactory animalFactory = new ProdusFactory();
	        prod = animalFactory.createInstance(Produse.pizza);
	        assertEquals(prod.toString(),"Sunt pizza" );
	}

	
}
