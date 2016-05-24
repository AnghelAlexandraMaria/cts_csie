package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Produs;

public class TestProdus2 {

	@Test
	public void test_getCodProdus() {
		Produs p = new Produs("A1234","detergent",13.3f,25);
		String cod = p.getCodProdus();
		assertEquals("A1234",cod);
	}
	@Test
		public void test_getDenumire() {
		Produs p = new Produs("A1234","detergent",13.3f,25);
		String denumire = p.getDenumire();
		assertEquals("detergent",denumire);
	}
	
	@Test
	public void test_getPret() {
	Produs p = new Produs("A1234","detergent",13,25);
	int pret = (int) p.getPret();
	assertEquals(13,pret);
}
	@Test
	public void test_getStoc (){
	Produs p = new Produs("A1234","detergent",13,25);
	int stoc = p.getStoc();
	assertEquals(25, stoc);
}
	
	//////////////////////////////////
	@Test
	public void test_CresterePret()
	{
		Produs p = new Produs("A1234","detergent",3,25);
		int rezultat=p.crestePret();
		assertEquals (13,rezultat);
		
	}
	
	public void test_ScadePret()
	{
		Produs p = new Produs("A1234","detergent",30,25);
		int rezultat=p.crestePret();
		assertEquals (20,rezultat);
		
	}
	
	@Test
	public void test_AplicaReducere()
	{
		Produs p = new Produs("A1234","detergent",100,25);
		int rez=p.AplicaReducere();
		//assertEquals(80, rez);
		assertEquals(90, rez);
		
	}
	
	@Test
	public void test_online()
	{
		Produs p = new Produs("A1234","detergent",100,25);
		boolean cod=p.getNotOnline();
		assertFalse(cod);
	}
	

}
