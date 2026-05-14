package cts.ase.ro.design;

public class Push implements StrategieNotificare{
    @Override
    public void trimiteNotificare(String utilizator, String mesaj) {
        System.out.println("Push notification pentru " + utilizator + " mesaj: " + mesaj);
    }
}
