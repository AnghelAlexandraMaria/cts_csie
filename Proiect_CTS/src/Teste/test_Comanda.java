package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Decorator.AComandaDecorata;
import Decorator.Comanda;
import Decorator.ComandaDecorata;
import Decorator.IComanda;
import builder.Client;

public class test_Comanda {

	@Test 
	public void test_getDenumire()
	{
		Comanda c = new Comanda("Comanda1");
		assertEquals("Comanda1", c.getDenumire());
		
	}
	
	


}
