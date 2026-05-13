package cts.ase.ro.design;

public class Carte implements Biblioteca{
    private String titlu;
    private String autor;

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }

    @Override
    public void adaugaNod(Biblioteca nod) throws Exception {
        throw new Exception("Este nod frunza (Cartea nu poate avea sub-noduri)");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Este nod frunza");
    }

    @Override
    public void stergeNod(Biblioteca nod) throws Exception {
        throw new Exception("Este nod frunza");
    }

    @Override
    public void descriere(String indent) {
        // afisare carte
        System.out.println(indent + "Carte: " + this.titlu + " Autor: " + this.autor);
    }
}
