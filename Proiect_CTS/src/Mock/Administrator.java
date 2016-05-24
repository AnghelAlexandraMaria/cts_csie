package Mock;




public class Administrator implements IAdministrator {

		public String nume;
		public String dataAngajare;
		public int varsta;
		
		
		// get set
		public String getNume() {
			return nume;
		}
		
		
		public String getDataAngajare() {
			return dataAngajare;
		}
		
			
		public int getVarsta() {
			return varsta;
		}
		
				
		public Administrator(String nume, String dataAngajare, int varsta) {
			super();
			this.nume = nume;
			
			this.dataAngajare = dataAngajare;
			this.varsta = varsta;
		}
		
		@Override
		public String toString() {
			return "Administrator" + nume + dataAngajare ;
		}
		
		
		
}
