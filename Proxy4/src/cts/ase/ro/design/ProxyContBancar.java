package cts.ase.ro.design;

public class ProxyContBancar implements IContBancar{
    //obiect cont
    private ContBancar cont;

    private int pinIntrodus;

    //constructor
    public ProxyContBancar(ContBancar cont, int pinIntrodus) {
        this.cont = cont;
        this.pinIntrodus = pinIntrodus;
    }

    @Override
    public void acceseazaCont() {

        if (pinIntrodus == cont.getClient().getPinCorect()) {
            System.out.println("Acces permis pentru client: " + cont.getClient().getNume());
            cont.acceseazaCont();
        } else {
            System.out.println("PIN gresit! Acces refuzat.");
        }
    }
}
