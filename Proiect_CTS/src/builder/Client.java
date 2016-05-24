package builder;

public class Client {

	String nume;
	String nrTel;
	String adresa;
	
	public Client()
	{
		super();
		this.nume = "Girescu Mihai";
		this.nrTel = "0766256900";
		this.adresa = "Bucuresti, sect 2";
	}

	public Client(String nume, String nrTel, String adresa) {
		super();
		this.nume = nume;
		this.nrTel = nrTel;
		this.adresa = adresa;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNrTel() {
		return nrTel;
	}

	public void setNrTel(String nrTel) {
		this.nrTel = nrTel;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Override
	public String toString() {
		return nume + " " + nrTel + " " +adresa;
	}
	
	

}
