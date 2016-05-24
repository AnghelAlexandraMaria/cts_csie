package Teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Comanda;
import junit.framework.Assert;



public class TestComanda {

	private Comanda c;
	private static ArrayList<Comanda> lista;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 lista=new ArrayList<>();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void testCalculValoare()
	{
		//public Comanda(int cantitate, String produs, float pret, int nrComanda) 
		Comanda c = new Comanda(12,"detergent", 3 ,3,"O120");
		int valoare = c.CalculValoare();
		assertEquals(36, valoare);
		
	}
	
	@Test
	public void testAdaugareTVA()
	{
		//public Comanda(int cantitate, String produs, float pret, int nrComanda) 
		Comanda c = new Comanda(12,"detergent", 3 ,3,"O120");
		float valoare = c.AdaugareTVA();
		//Assert.assertEquals(8.64f, valoare,0.0002);
		assertEquals(0.1, 8.64,valoare);
		
	}
	
	@Test
	public void testTipComanda()
	{
		Comanda c = new Comanda(12,"detergent", 3 ,3,"O120");
		String rezultat = c.getTipcomanda();
		assertEquals("online", rezultat);
	}
	
	@Test
	public void test_getCantitate()
	{
		//Comanda(int cantitate, String produs, float pret, int nrComanda, String tipComanda)
		Comanda c = new Comanda(12,"detergent", 3 ,3,"O120");
		int i = c.getCantitate();
		assertEquals(12,i);
	}
	
	public void test_getProdus()
	{
		//Comanda(int cantitate, String produs, float pret, int nrComanda, String tipComanda)
		Comanda c = new Comanda(12,"detergent", 3 ,3,"O120");
		String s = c.getProdus();
		assertEquals("detergent",s);
	}
	
	public void test_getpret()
	{
		//Comanda(int cantitate, String produs, float pret, int nrComanda, String tipComanda)
		Comanda c = new Comanda(12,"detergent", 3 ,3,"O120");
		int f = (int) c.getPret();
		assertEquals(3,f);
	}
	
	@Test
	public void test_getNrComanda()
	{
		//Comanda(int cantitate, String produs, float pret, int nrComanda, String tipComanda)
		Comanda c = new Comanda(12,"detergent", 3 ,3,"O120");
		int i = c.getNrComanda();
		assertEquals(3,i);
	}
	public void test_getTipComanda()
	{
		//Comanda(int cantitate, String produs, float pret, int nrComanda, String tipComanda)
		Comanda c = new Comanda(12,"detergent", 3 ,3,"O120");
		String s = c.getTipcomanda();
		assertEquals("O120detergent",s);
	}
	
	@Test
	public void testListaComezi() {
		//ArrayList<Integer> lista=new ArrayList<>();
		 lista=new ArrayList<>();
		 Comanda c1 = new Comanda(12,"detergent", 3 ,3,"O120");
		 Comanda c2 = new Comanda(12,"pix", 3 ,3,"O120");
		 Comanda c3 = new Comanda(12,"creion", 3 ,3,"O120");
		lista.add(c1);
		lista.add(c1);
		lista.add(c3);
		c= new Comanda(lista);
		assertEquals(lista, c.getListaComenzi());
	}
	
	/*@Test
	public void testLista() {
		//ArrayList<Integer> lista=new ArrayList<>();
		 lista=new ArrayList<>();
		 Comanda c1 = new Comanda(12,"detergent", 3 ,3,"O120");
		 //Comanda c2 = new Comanda(12,"pix", 3 ,3,"O120");
		// Comanda c3 = new Comanda(12,"creion", 3 ,3,"O120");
		lista.add(c1);
		//lista.add(c2);
		//lista.add(c3);
		
		assertEquals(lista.add(c1), c.adaugaComenzi());
	}
	*/
	@Test
	public void test_crestereCantitate()
	{
		Comanda c = new Comanda(12,"detergent", 3 ,3,"O120");
		int rez=c.cresteCantitateCuOUnitate();
		assertEquals(13, rez);
	}
	
	@Test
	public void test_scadereCantitate()
	{
		Comanda c = new Comanda(12,"detergent", 3 ,3,"O120");
		int rez=c.scadereCantitate();
		assertEquals(11, rez);
	}
	
	
}
