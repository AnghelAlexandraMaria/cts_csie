package Teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import builder.Client;
import builder.ClientBuild;

public class test_Client {

	@Test 
	public void test_constructor()
	{
		Client c = new Client("Girescu Mihai","0766256900","Bucuresti, sect 2");
		Client d = new Client();
		d.setNume("Girescu Mihai");
		d.setNrTel( "0766256900");
		d.setAdresa("Bucuresti, sect 2");
		assertEquals(c.getNume(), d.getNume());
		
	}
	
	@Test 
	public void test_setNume()
	{
		Client d = new Client();
		d.setNume("Girescu Mihai");
		assertSame(d.getNume(), "Girescu Mihai");
	}
	
	@Test 
	public void test_setAdresa()
	{
		Client d = new Client();
		d.setNume("Girescu Mihai");
		assertSame(d.getAdresa(), "Bucuresti, sect 2");
	}
	@Test 
	public void test_setNrTel()
	{
		Client d = new Client();
		d.setNume("Girescu Mihai");
		assertSame(d.getNrTel(), "0766256900");
	}
	
	@Test
	public void test_getNUme()
	{
		Client c = new Client("Girescu Mihai","0766256900","Bucuresti, sect 2");
		assertSame(c.getNume(), "Girescu Mihai");
	}

	@Test
	public void test_getNrTel()
	{
		Client c = new Client("Girescu Mihai","0766256900","Bucuresti, sect 2");
		assertSame(c.getNrTel(), "0766256900");
	}
	@Test
	public void test_getAdresa()
	{
		Client c = new Client("Girescu Mihai","0766256900","Bucuresti, sect 2");
		assertSame(c.getAdresa(), "Bucuresti, sect 2");
	}
	
	@Test
	public void test_builderNume()
	{
		Client c ;
		c=new ClientBuild().nume("Girescu Mihai").nr_tel("0766256900").adresa("Bucuresti, sect 2").build();
		Client d = new Client("Girescu Mihai","0766256900","Bucuresti, sect 2");
		assertSame(c.getNume(), d.getNume());
	}
	@Test
	public void test_builderAdresa()
	{
		Client c ;
		c=new ClientBuild().nume("Girescu Mihai").nr_tel("0766256900").adresa("Bucuresti, sect 2").build();
		Client d = new Client("Girescu Mihai","0766256900","Bucuresti, sect 2");
		assertSame(c.getAdresa(), d.getAdresa());
	}
	@Test
	public void test_builderNrTel()
	{
		Client c ;
		c=new ClientBuild().nume("Girescu Mihai").nr_tel("0766256900").adresa("Bucuresti, sect 2").build();
		Client d = new Client("Girescu Mihai","0766256900","Bucuresti, sect 2");
		assertSame(c.getNrTel(), d.getNrTel());
	}
	@Test
	public void test_builderToSTring()
	{
		Client c ;
		c=new ClientBuild().nume("Girescu Mihai").nr_tel("0766256900").adresa("Bucuresti, sect 2").build();
		Client d = new Client("Girescu Mihai","0766256900","Bucuresti, sect 2");
		assertEquals(c.toString(),d.toString());
	}
	
	@Test
	public void test_ToSTring()
	{
		Client c ;
		c = new Client("Girescu Mihai","0766256900","Bucuresti, sect 2");
		Client d = new Client();
		d.setNume("Girescu Mihai");
		d.setNrTel( "0766256900");
		d.setAdresa("Bucuresti, sect 2");
		assertEquals(c.toString(),d.toString());
	}
}
