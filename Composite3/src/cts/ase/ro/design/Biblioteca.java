package cts.ase.ro.design;

public interface Biblioteca {
    // adauga un nod (raft / sectiune / carte)
    void adaugaNod(Biblioteca nod) throws Exception;

    // accesare nod
    void getNod(int index) throws Exception;

    // stergere nod
    void stergeNod(Biblioteca nod) throws Exception;

    // afisare ierarhica
    void descriere(String indent);
}
