package Decorator;

public class Decorator {

public static void main(String[] args) {
        
        IComanda ifilm = new Comanda("comanda 1");
        AComandaDecorata afilmDecorat = new ComandaDecorata(ifilm);
        afilmDecorat.Decorat();
        afilmDecorat.comandaTrimisa();
    }
}
