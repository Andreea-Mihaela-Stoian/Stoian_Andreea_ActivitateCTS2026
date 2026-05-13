package cts.ase.ro.design;

public interface StructuraMagazin {
    // adauga un nod (categorie / subcategorie / produs)
    void adaugaNod(StructuraMagazin nod) throws Exception;

    // accesare nod dupa index
    void getNod(int index) throws Exception;

    // stergere nod
    void stergeNod(StructuraMagazin nod) throws Exception;

    // afisare ierarhica
    void descriere(String indent);
}
