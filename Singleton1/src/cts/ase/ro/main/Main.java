package cts.ase.ro.main;

import cts.ase.ro.clase.Buletin;

public class Main {
    static void main(String[] args) {
        Buletin buletin1 = Buletin.getInstance("Stoian", "Andreea", 86789, "Bucuresti");
        System.out.println(buletin1);
    }
}
