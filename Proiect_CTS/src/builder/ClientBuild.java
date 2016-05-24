package builder;

public class ClientBuild extends Client implements IClientBuild{

	public ClientBuild nume (String nume) {
	nume=nume;
	return this;
	} 
	

	public ClientBuild nr_tel(String nrTel) {
		nrTel=nrTel;
		return this;
	} 
	

	public ClientBuild adresa(String adresa) {
		adresa=adresa;
		return this;
	} 
	
	@Override
	public Client build() {
		
		return new Client(nume, nrTel, adresa);
	}

	
}
