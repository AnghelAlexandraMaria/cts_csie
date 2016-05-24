package SimpleFactory;

public class ProdusFactory {

	public Produs createInstance(Produse produs)
	{
		switch (produs)
	    {
	        case pizza: return new Pizza();
	        case paste: return new Paste();
	        case desert : return new Desert();
	        
	    }
	    return null;
	    }
	}

