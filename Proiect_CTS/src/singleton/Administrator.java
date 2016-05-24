package singleton;

public class Administrator {

	public String nume;
	public String telefon;
	public String adresa;
	public String dataAngajare;
	
	
	// get set
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getTelefon() {
		if (telefon.length() == 10)
			return telefon;
		else return null;
		
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getDataAngajare() {
		return dataAngajare;
	}
	public void setDataAngajare(String dataAngajare) {
		this.dataAngajare = dataAngajare;
	}
	
	
	private static Administrator instanta;
	
	
	public Administrator() {
		super();
		this.nume = "Anghel Alexandru";
		this.telefon = "0762981435";
		this.adresa = "Bucuresti, sect 1";
		this.dataAngajare = "30.01.2013";
		
	}
	
	public static Administrator getInstanta()
	{
		if (instanta == null)
		
			instanta = new Administrator();
			return instanta;
		
	}
	
	@Override
	public String toString() {
		return "Administrator [nume=" + nume + ", telefon=" + telefon + ", adresa=" + adresa + ", dataAngajare="
				+ dataAngajare + "]";
	}
	
	public boolean checkNrTelefon_numarCaractere(){
		if (telefon.length() == 10)
			return true;
		else return false;
	}
	
	
	
}
