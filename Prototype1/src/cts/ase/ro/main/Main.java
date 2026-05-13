package cts.ase.ro.main;

import cts.ase.ro.clase.InterfataPrototype;
import cts.ase.ro.clase.Masina;

public class Main {
    public static void main(String[] args) {
        InterfataPrototype masina1= new Masina("Audi", "A3", "Rosu", 2.0f, 800000);
        InterfataPrototype masina3= new Masina("BMW", "X5", "Albastru", 0.7f, 600000);
        InterfataPrototype masina2 =masina1.copy();

        ((Masina) masina2).setPret(750000); // facem caasting

        System.out.println(masina1);
        System.out.println(masina2);
        System.out.println(masina3);



    }
}
