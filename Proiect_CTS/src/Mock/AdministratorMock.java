package Mock;

public class AdministratorMock  implements IAdministrator{

	public AdministratorMock( String nume, String dataAngajare, int varsta) {
		
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 20;
	}

	

	@Override
	public String getDataAngajare() {
		// TODO Auto-generated method stub
		return "28Ian2012";
	}


	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return "Anghel Alexandra";
	}

}
