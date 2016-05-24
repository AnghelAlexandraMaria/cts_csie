package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import SimpleFactory.Pizza;
import SimpleFactory.Produs;
import SimpleFactory.ProdusFactory;
import SimpleFactory.Produse;

public class test_Produs {

	@Test
	public void test_factory()
	{
		 Produs prod;
	        ProdusFactory animalFactory = new ProdusFactory();
	        prod = animalFactory.createInstance(Produse.pizza);
	        assertEquals(prod.toString(),"Sunt pizza" );
	}

}
