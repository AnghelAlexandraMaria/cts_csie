package builder;

public class Builder {

	public static void main(String[] args) {
        // TODO code application logic here
        Client c;
      //  c= new ClientBuild().culoare("alb").varsta(3).build();
        c=new ClientBuild().nume("").nr_tel("").adresa("").build();
        System.out.println(c.toString());
        
        //Caine caine2;
        Client c2;
        //caine2 = new CaineBuild().culoare("dalmatian").build();
        c2 =  new ClientBuild().adresa("").build();
        System.out.println(c2.toString());
}
}
