package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Operatii;
import junit.framework.TestResult;
import singleton.Administrator;

public class test_Administrator implements junit.framework.Test {

	@Test
	public void test_instanta()
	{
		Administrator a= Administrator.getInstanta();
		Administrator b = Administrator.getInstanta();
		Administrator rez = a.getInstanta();
		assertSame("instanta unica",a, b);
	}
	@Test
	public void test_instanta2()
	{
		Administrator a= Administrator.getInstanta();
		Administrator b = Administrator.getInstanta();
		assertNotNull(b);
	}
	
	@Test
	public void test_instanta_NotNull()
	{
		Administrator admin1= Administrator.getInstanta();
		assertNotNull(admin1);
	}
	
	@Test
	public void test_instantaNUme()
	{
		Administrator a= Administrator.getInstanta();
		Administrator b = Administrator.getInstanta();
		assertSame("acelasi nume", a.nume, b.nume);
	}
	@Test
	public void test_instantaTelefon()
	{
		Administrator a= Administrator.getInstanta();
		Administrator b = Administrator.getInstanta();
		assertSame("acelasi telefon", a.telefon, b.telefon);
	}
	@Test
	public void test_instantaAdresa()
	{
		Administrator a= Administrator.getInstanta();
		Administrator b = Administrator.getInstanta();
		assertSame("aceeasi adresa", a.adresa, b.adresa);
	}
	@Test
	public void test_instantaDataAngajare()
	{
		Administrator a= Administrator.getInstanta();
		Administrator b = Administrator.getInstanta();
		assertSame("acelasi nume", a.dataAngajare, b.dataAngajare);
	}

	@Test
	public void test_toString()
	{
		Administrator a= Administrator.getInstanta();
		Administrator b = Administrator.getInstanta();
		String aa=a.toString();
		String bb=b.toString();
		assertEquals("aceeasi identitate", aa, bb);
	}
	
	@Test
	public void test_nrcaratereTelefon()
	{
				
		Administrator a= new Administrator();
		String rez = a.getTelefon();
		assertEquals(rez,"0762981435" );
	}
	
	@Test
	public void test_telefonCorrect()
	{
		
		Administrator a= new Administrator();
		a.checkNrTelefon_numarCaractere();
		assertTrue(true);
	}
	
	
	@Test
	public void test_notNullAplicareOferta()
	{
		Operatii op = new Operatii(110);
		//op.aplicareOferta(10);
		assertNotNull(op.aplicareOferta(10));
	}
	
	@Test
	public void test_limite()
	{
		Operatii op = new Operatii(110);
		assertFalse(op.limitePret());
	}
	
	@Test
	public void test_limite2()
	{
		Operatii op = new Operatii(99);
		assertTrue(op.limitePret());
	}
	
	
	@Override
	public int countTestCases() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void run(TestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
