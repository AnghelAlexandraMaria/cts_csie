package Decorator;

public class ComandaDecorata extends AComandaDecorata {

	public ComandaDecorata(IComanda iComanda) {
		super(iComanda);
		
	}

	@Override
	public void comandaTrimisa() {
		System.out.println("Comanda decorata trimisa");
		
	}

	@Override
	public void comandaRetur() {
		System.out.println("Comanda decorata s-a intors");
	}

	@Override
	public String getDenumire() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void Decorat() {
		System.out.println("Comanda decorata");
		
	}
	
	@Override
	public String toString() {
		return "ComandaDecorata [iComanda=" + iComanda + "]";
	}

	
}
