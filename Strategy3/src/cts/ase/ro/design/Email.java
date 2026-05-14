package cts.ase.ro.design;

public class Email implements StrategieNotificare{
    @Override
    public void trimiteNotificare(String utilizator, String mesaj) {
        System.out.println("Email trimis catre " + utilizator + " mesaj: " + mesaj);
    }
}
