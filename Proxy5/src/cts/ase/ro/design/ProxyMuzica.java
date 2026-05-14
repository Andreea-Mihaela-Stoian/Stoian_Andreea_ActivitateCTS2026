package cts.ase.ro.design;

public class ProxyMuzica implements IMuzica{
    private Muzica muzica;

    public ProxyMuzica(Muzica muzica) {
        this.muzica = muzica;
    }

    @Override
    public void redaMelodie() {

        if (muzica.getUtilizator().isAbonamentPremium()) {
            System.out.println("Acces premium pentru: " + muzica.getUtilizator().getNume());
            muzica.redaMelodie();
        } else {
            System.out.println("Trebuie abonament premium pentru a reda: " + muzica.getPiesa());
        }
    }
}
