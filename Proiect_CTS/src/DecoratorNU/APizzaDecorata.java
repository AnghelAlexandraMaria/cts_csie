package DecoratorNU;

public abstract class APizzaDecorata implements IPizza{
	
	IPizza iPizza;
	
	public APizzaDecorata(IPizza iPizza){
		this.iPizza=iPizza;
	}

	public abstract int fct_nr_ingrediente();
	
	
}
