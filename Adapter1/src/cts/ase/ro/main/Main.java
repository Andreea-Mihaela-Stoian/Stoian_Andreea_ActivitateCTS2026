package cts.ase.ro.main;

import cts.ase.ro.design.*;

public class Main {
    public static void main(String[] args) {
        IController controller = new Controller("Xbox", true, 80);
        controller.conectareController();

        IKeyboardGaming tastatura = new TastaturaGaming("Razer", true, 104);
        tastatura.conectareTastatura();

        System.out.println("-----------Apel dupa adaptare------------");
        IController controllerAdapter = new ControllerAdapter(tastatura);
        controllerAdapter.conectareController();
    }
}
