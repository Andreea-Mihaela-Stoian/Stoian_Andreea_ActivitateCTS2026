package cts.ase.ro.design;

public class ContBancar implements IContBancar{
    private double sold;
    //obiectul client
    private ClientBanca client;

    //constructor
    public ContBancar(double sold, ClientBanca client) {
        this.sold = sold;
        this.client = client;
    }

    //getter atribute
    public double getSold() {
        return sold;
    }

    public ClientBanca getClient() {
        return client;
    }

    @Override
    public void acceseazaCont() {
        System.out.println("Cont accesat cu succes");
    }
}
