package clase;



import java.lang.reflect.Array;
import java.util.ArrayList;

public class Comanda {

	public int cantitate;
	public String produs;
	public float pret;
	public int nrComanda;
	public String tipComanda;
		
	public ArrayList<Comanda> listaComenzi ;
	public ArrayList<Float> vectorPreturi;

	public int getCantitate() 
	{
		return cantitate;
	}

	public void setCantitate(int cantitate) 
	{
		this.cantitate = cantitate;
	}

	public String getProdus() 
	{
		return produs;
	}

	public void setProdus(String produs) 
	{
		this.produs = produs;
	}

	public float getPret() 
	{
		return pret;
	}

	public void setPret(float pret)
	{
		this.pret = pret;
	}

	public int getNrComanda() 
	{
		return nrComanda;
	}

	public void setNrComanda(int nrComanda) 
	{
		this.nrComanda = nrComanda;
	}

	
	public String getTipcomanda() {
		switch(tipComanda.charAt(0)){
		case 'O': return "online";
		case 'P': return "nu e online";
		
	}
	return "N/A";
	}

	
	//get set lista
	public ArrayList<Comanda> getListaComenzi() 
	{
		return listaComenzi;
	}

	public void setListaComenzi(ArrayList<Comanda> listaComenzi) 
	{
		this.listaComenzi = listaComenzi;
	}

	
	public Comanda(int cantitate, String produs, float pret, int nrComanda, String tipComanda) 
	{
		super();
		this.cantitate = cantitate;
		this.produs = produs;
		this.pret = pret;
		this.nrComanda = nrComanda;
		this.tipComanda = tipComanda;
	}
		
	public Comanda() 
	{
		super();
	}

	
		public int CalculValoare()
		{
			return (int) (pret*cantitate);
			//return 3*12;
		}

	
		public float AdaugareTVA()
		{
			float aTVA= (float) (pret*cantitate*0.24);
			return aTVA;
		}
		///////////////////////////////////////////////
		
		public Comanda(ArrayList<Comanda> vectorNou){
			//vector=new ArrayList<Integer>();	
			if(vectorNou!=null){
				listaComenzi=new ArrayList<Comanda>();
			for(int i=0;i<vectorNou.size();i++)
				listaComenzi.add(vectorNou.get(i));
			}else{
				listaComenzi=null;
			}
		}
		
		//singleton
		private static Comanda instanta;
		public static Comanda GetInstanta()
		{
			if (instanta == null)
				instanta= new Comanda();
			return instanta;
		}
	
	
		public int cresteCantitateCuOUnitate()
		{
			
			return cantitate+1;
		}
		
		
		public int scadereCantitate()
		{
			return cantitate-1;
		}
	
	
	
}