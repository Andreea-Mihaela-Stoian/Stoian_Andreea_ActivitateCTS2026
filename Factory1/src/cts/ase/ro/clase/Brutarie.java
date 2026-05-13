package cts.ase.ro.clase;

//clasa neaparat abstract
public abstract class Brutarie {
    //atributele neaparat protected ca sa fie mostenite
    protected String tipFaina;
    // generate constructor
    public Brutarie(String tipFaina) {
        this.tipFaina = tipFaina;
    }
}
