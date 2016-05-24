package clase;

public class Operatii {

	float pret;
	
	public Operatii(float pret) {
		super();
		this.pret = pret;
	}


	public float getPret() {
		return pret;
	}

	public float adaos_pret(int n)
	{
		return pret =pret+n;
	}
	
	public float aplicareOferta(int m)
	{
		if(pret >0 && pret <101)
		{
			 pret=pret -(m/100*pret);
		}
		else 
		{
			pret=pret;
		}
		return pret;
		
	}
	public boolean limitePret()
	{
		if (pret >100)
			return false;
		else
			return true;
	}
	
	
}
