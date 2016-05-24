package clase;

public class Produs {

	public String codProdus;
	public String denumire;
	public float pret;
	public int stoc;
	
	public String getCodProdus() {
		return codProdus;
	}
	public void setCodProdus(String codProdus) {
		this.codProdus = codProdus;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public float getPret() {
		return pret;
	}
	public void setPret(float pret) {
		this.pret = pret;
	}
	public int getStoc() {
		return stoc;
	}
	public void setStoc(int stoc) {
		this.stoc = stoc;
	}
	
	public Produs(String codProdus, String denumire, float pret, int stoc) {
		super();
		this.codProdus = codProdus;
		this.denumire = denumire;
		this.pret = pret;
		this.stoc = stoc;
	}
	public Produs() {
		super();
	}
	@Override
	public String toString() {
		return "Produs [codProdus=" + codProdus + ", denumire=" + denumire
				+ ", pret=" + pret + ", stoc=" + stoc + "]";
	}
	
	public String get_codProdus() {
		switch(codProdus.charAt(0)){
			case 'O': return "online";
			case 'P': return "nu e online";
			
		}
		return "N/A";
		}
	
	public boolean getNotOnline() {
		switch(codProdus.charAt(0)){
			case 'O': return false;
			case 'P': return true;
			
		}
		return false;
		}
	
	public int crestePret()
	{
		return (int) (pret+10);
		
	}
	public int scadePret()
	{
		return (int) (pret-10);
		
	}
	
	public int AplicaReducere()
	{
		
		return (int) (pret - (0.1*pret));
		
	}
	
	
}
	
		
	

