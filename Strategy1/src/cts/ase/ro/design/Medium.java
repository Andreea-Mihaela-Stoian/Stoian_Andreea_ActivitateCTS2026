package cts.ase.ro.design;

public class Medium implements ModJoc{

    @Override
    public void nivelDificultate(String numeJucator, int nivel) {
        System.out.println(numeJucator + " joaca la dificultate MEDIUM nivel " +nivel);
    }
}
