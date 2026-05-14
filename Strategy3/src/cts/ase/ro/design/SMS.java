package cts.ase.ro.design;

public class SMS implements StrategieNotificare{

    @Override
    public void trimiteNotificare(String utilizator, String mesaj) {
        System.out.println("SMS trimis catre " + utilizator + " mesaj: " + mesaj);
    }
}
