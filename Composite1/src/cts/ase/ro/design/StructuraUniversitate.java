package cts.ase.ro.design;

public interface StructuraUniversitate {
    // adauga un nod (poate fi departament sau specializare)
    void adaugaNod(StructuraUniversitate nod) throws Exception;

    // accesare nod
    void getNod(int index) throws Exception;

    // stergere nod
    void stergeNod(StructuraUniversitate nod) throws Exception;

    // afisare ierarhica
    void descriere(String indent);
}
