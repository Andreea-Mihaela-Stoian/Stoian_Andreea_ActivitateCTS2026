package cts.ase.ro.design;

public class CasetofonAdapter implements ICasetofon{
    // adapter-ul primeste un obiect din sistemul nou
    private IBoxaBluetooth boxaBluetooth;

//generate constructor
    public CasetofonAdapter(IBoxaBluetooth boxaBluetooth) {
        this.boxaBluetooth = boxaBluetooth;
    }

    @Override
    public void redareCaseta() {
        // "traduce" apelul din sistemul vechi pt sistemul nou
        boxaBluetooth.conectareBluetooth();
    }
}
