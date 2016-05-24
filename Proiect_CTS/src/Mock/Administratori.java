package Mock;

public class Administratori {

	
	private IAdministrator admPrim;
	private IAdministrator admSec;
	
	public Administratori(IAdministrator admPrim, IAdministrator admSec)
	{
		
		this.admPrim=admPrim;
		this.admSec=admSec;
	}
	
	public int diferentaVarsta()
	{
		return admPrim.getVarsta()-admSec.getVarsta();
	}
	
	public String varstaMaiMare()
	{
		if(admPrim.getVarsta() >  admSec.getVarsta())
			return admPrim.getDataAngajare();
		else
			return admSec.getDataAngajare();
	}
}
