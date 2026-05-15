package cts.stoian.andreea.s.composite;

public interface StructuraOMS {
    // adauga nod in arbore
    void adaugaNod(StructuraOMS nod) throws Exception;

    // sterge nod din arbore
    void stergeNod(StructuraOMS nod) throws Exception;

    // acceseaza nod dupa index
    void getNod(int index) throws Exception;

    // afisare structurata
    void descriere(String indent);

    // calculeaza total cazuri
    int getTotalCazuri();
}
