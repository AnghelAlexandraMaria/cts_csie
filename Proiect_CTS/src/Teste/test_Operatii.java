package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Operatii;

public class test_Operatii {

	@Test
	public void test_pretCorect()
	{
		Operatii op=new Operatii(10);
		op.adaos_pret(10);
		assertEquals(1,20, op.getPret());
	}
	

	@Test
	public void test_aadaosPret()
	{
		Operatii op=new Operatii(10);
		//op.adaos_pret(10);
		assertEquals(1,op.adaos_pret(10), 20);
	}
	@Test
	public void aplicareOferta()
	{
		Operatii op=new Operatii(100);
		//assertEquals(0.1,op.aplicareOferta(10),9);
		assertEquals(0.1,9, op.aplicareOferta(10));
	}
	
	@Test
	public void aplicareOferta2()
	{
		Operatii op=new Operatii(102);
		//assertEquals(0.1,op.aplicareOferta(10),9);
		assertEquals(0.1,102, op.aplicareOferta(10));
	}
	
	@Test
	public void test_limite()
	{
		Operatii op=new Operatii(102);
		boolean rez = op.limitePret();
		assertFalse(rez);
	}
	
	@Test
	public void test_limite2()
	{
		Operatii op=new Operatii(10);
		boolean rez = op.limitePret();
		assertTrue(rez);
	}
}
