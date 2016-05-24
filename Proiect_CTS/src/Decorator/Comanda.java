package Decorator;



public class Comanda implements IComanda {
	
	String nume;
	
	

	public Comanda(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void comandaTrimisa() {
		
		
		System.out.println("Comanda trimisa");
		
	}

	@Override
	public void comandaRetur() {
		System.out.println("Comanda s-a intors");
		
	}

	@Override
	public String getDenumire() {
		// TODO Auto-generated method stub
		return nume;
	}

	@Override
	public String toString() {
		return "Comanda [nume=" + nume + "]";
	}
	
	
	
	
	
}
