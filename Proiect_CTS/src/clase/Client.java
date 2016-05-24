package clase;


public class Client {
	
public String nume;
public String firma;
public String telefon;
public String adresa;
public String data;
public String codClient;

public String getNume() {
	return nume;
}

public void setNume(String nume) {
	this.nume = nume;
}

public String getFirma() {
	return firma;
}

public void setFirma(String firma) {
	this.firma = firma;
}

public String getTelefon() {
	return telefon;
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

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public String getCodClient() {
	return codClient;
}

public void setCodClient(String codClient) {
	this.codClient = codClient;
}

public Client() 
{
	super();
}

public Client(String nume, String firma, String telefon, String adresa,
		String data, String codClient) 
{
	super();
	this.nume = nume;
	this.firma = firma;
	this.telefon = telefon;
	this.adresa = adresa;
	this.data = data;
	this.codClient = codClient;
}

public boolean checkCodClient_numarCaractere(){
	if (codClient.length() == 4)
		return true;
	else return false;
}

public String verificareCod()
{
	
		if(codClient.charAt(0)=='B')
		{
		 return "Bucuresti";
		 }
		else return "alta locatie";
		
}

public boolean checkNrTelefon_numarCaractere(){
	if (telefon.length() == 10)
		return true;
	else return false;
}
}

