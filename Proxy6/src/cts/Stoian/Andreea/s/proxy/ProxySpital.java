package cts.Stoian.Andreea.s.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxySpital implements ISpital{

    // creare lista
    private List<Spital> vizitatoriInAsteptare = new ArrayList<>();

    //functie de adaugare in lista
    public void adaugaVisitator(Spital spital){
        vizitatoriInAsteptare.add(spital);
    }

    @Override
    public void permiteAccess() {
        // if conditie minim 3 vizitatori
        if (vizitatoriInAsteptare.size() >= 3) {
            System.out.println("Sunt minim 3 vizitatori. Personalul medical ofera haine de protectie.");

            for (Spital spital : vizitatoriInAsteptare) {
                Vizitator vizitator = spital.getVizitator();

                if (vizitator.isScrisoareAcceptare()) {
                    vizitator.setHaineProtectie(true);
                    spital.permiteAccess();
                } else {
                    System.out.println("Vizitatorul " + vizitator.getNume() + " nu are scrisoare de acceptare.");
                }
            }
        } else {
            System.out.println("Nu sunt minim 3 vizitatori in sala de asteptare.");
        }
    }
}
