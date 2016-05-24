package Decorator;

public abstract class AComandaDecorata implements IComanda{
	IComanda iComanda;

	public AComandaDecorata(IComanda iComanda) {
		super();
		this.iComanda = iComanda;
	}
	
	
	public abstract void Decorat();

}
