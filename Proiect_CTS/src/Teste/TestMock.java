package Teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import Mock.Administrator;
import Mock.Administratori;
import Mock.IAdministrator;


public class TestMock {

	//pe mock nu e relevant sa facem teste
		@Test
		public void test_Mock_varsta() {
			int rez = 20;
			assertEquals(rez, 20);
		}
	
		
		//testare diferenta 
		//cu mock
		
		@Test
		public void test_diferenta()
		{
			Administrator a1 = new Administrator("Anghel","11Iunie2013",23);
			Administrator a2 = new Administrator("Anghel Alexnadra","11Iunie2013",20);
			
			Administratori admini =  new Administratori(a1, a2);
			
			assertEquals(3,admini.diferentaVarsta());
		}
		
		
		// testare cu mock
		//exceptie
		
		@Test
		public void testChechCUeXceptie()
		{
			
			IAdministrator a1 =mock(Administrator.class);
			IAdministrator a2 =mock(Administrator.class);
			
			when (a1.getVarsta()).thenReturn(23);
			when (a2.getVarsta()).thenReturn(22);
			
			
		}
		
		
		

}
