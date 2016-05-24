package SimpleFactory;

public class Produs {

	public String codProdus;
	public String denumire;
	public float pret;
	public int stoc;
	
	public Produs() {
		super();
	}

	@Override
	public String toString() {
		return  codProdus + ", " + denumire + "," + pret + "," + stoc ;
	}
		
	
	
}
