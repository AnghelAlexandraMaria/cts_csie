package Teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import clase.Produs;

public class TestProdus {

	private static FileReader reader;
	private static BufferedReader bf;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		reader = new FileReader("Date.txt");
		bf = new BufferedReader(reader);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		bf.close();
		reader.close();
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	
	///fail
	@Test
	public void testDinFisier() {
		String linie = null;
		try {
			while ((linie = bf.readLine()) != null && linie.length() > 0) {
				String cod=linie.split(" ")[0];
				String denumire=linie.split(" ")[1];
				boolean rezAsteptat = !linie.split(" ")[2].equals("0");
				
				Produs p=new Produs();
				p.setCodProdus(cod);
				p.setDenumire(denumire);
				boolean b=p.getNotOnline();
				assertEquals(rezAsteptat, b);
			}
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
	
	