package SimpleFactory;

public class simpleFactory {

	public static void main(String[] args) {
        // TODO code application logic here
        
        Produs prod;
        ProdusFactory animalFactory = new ProdusFactory();
        
        prod = animalFactory.createInstance(Produse.pizza);
        System.out.println(prod.toString());
        
        prod= animalFactory.createInstance(Produse.paste);
        System.out.println(prod.toString());
        
        prod= animalFactory.createInstance(Produse.desert);
        System.out.println(prod.toString());
    }
	
}
