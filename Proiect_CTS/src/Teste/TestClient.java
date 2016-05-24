package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Client;

public class TestClient {

	/*Client(String nume, String firma, String telefon, String adresa,
		Date data, String codClient) */

	
	@Test
	public void testCod_numarCaractere()
	{
		Client c = new Client("Anghel", "a","a","a","2004-02-09","aaaa");
		boolean rezultat = c.checkCodClient_numarCaractere();
		assertTrue(rezultat);
		
	}
	@Test
	public void test_getNume()
	{
		Client c= new Client("Anghel", "ASE", "0762988000", "Bucuresti", "23Ianuarie2014", "A20");
		String nume = c.getNume();
		assertEquals("Anghel",nume);
	}
	@Test
	public void test_getFirma()
	{
		Client c= new Client("Anghel", "ASE", "0762988000", "Bucuresti", "23Ianuarie2014", "A20");
		String s = c.getFirma();
		assertEquals("ASE",s);
	}
	@Test
	public void test_getTelefon()
	{
		Client c= new Client("Anghel", "ASE", "0762988000", "Bucuresti", "23Ianuarie2014", "A20");
		String s = c.getTelefon();
		assertEquals("0762988000",s);
	}
	@Test
	public void test_getAdresa()
	{
		Client c= new Client("Anghel", "ASE", "0762988000", "Bucuresti", "23Ianuarie2014", "A20");
		String s = c.getAdresa();
		assertEquals("Bucuresti",s);
	}
	@Test
	public void test_getData()
	{
		Client c= new Client("Anghel", "ASE", "0762988000", "Bucuresti", "23Ianuarie2014", "A20");
		String s = c.getData();
		assertEquals("23Ianuarie2014",s);
	}
	@Test
	public void test_getCod()
	{
		Client c= new Client("Anghel", "ASE", "0762988000", "Bucuresti", "23Ianuarie2014", "B20");
		String s = c.getCodClient();
		assertEquals("B20",s);
	}

	@Test
	public void test_analiz_Client()
	{
		Client c= new Client("Anghel", "ASE", "0762988000", "Bucuresti", "23Ianuarie2014", "B20");
		String s = c.verificareCod();
		assertEquals("Bucuresti",s);
	}
	
	@Test
	public void test_nrTel()
	{
		Client c= new Client("Anghel", "ASE", "0762988000", "Bucuresti", "23Ianuarie2014", "B20");
		boolean s = c.checkNrTelefon_numarCaractere();
		assertTrue(s);
	}
	
	@Test
	public void test_nrTel_incorect()
	{
		Client c= new Client("Anghel", "ASE", "00762988000", "Bucuresti", "23Ianuarie2014", "B20");
		boolean s = c.checkNrTelefon_numarCaractere();
		assertFalse(s);
	}
	
	@Test
	public void test_verifcod()
	{
		Client c= new Client("Anghel", "ASE", "00762988000", "Bucuresti", "23Ianuarie2014", "B20");
		String s = c.verificareCod();
		assertEquals("Bucuresti", s);
	}
}
