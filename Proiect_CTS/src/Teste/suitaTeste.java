package Teste;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestClient.class,
	TestComanda.class,
	test_Administrator.class,
	test_Client.class,
	test_Comanda.class,
	test_Operatii.class,
	test_PizzaDecorator.class})

public class suitaTeste {

	
}