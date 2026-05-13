package cts.ase.ro.design;

public class ControllerAdapter implements IController{
    private IKeyboardGaming tastaturaGaming;

    public ControllerAdapter(IKeyboardGaming tastaturaGaming) {
        this.tastaturaGaming = tastaturaGaming;
    }

    @Override
    public void conectareController() {
        tastaturaGaming.conectareTastatura();
    }
}
