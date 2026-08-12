package core_java;
interface Device {
    void powerOn();
}
interface Camera {
    void takePhoto();
}
interface Smartphone extends Device, Camera {
    void browseInternet();
}
class iPhone implements Smartphone {
    @Override
    public void powerOn() {
        System.out.println("iPhone is powering on...");
    }
    @Override
    public void takePhoto() {
        System.out.println("I want to take a photo.");
    }
    @Override
    public void browseInternet() {
        System.out.println("Browsing websites on 5G network...");
    }
}
public class CtoMultipleInterfaces{
    public static void main(String[] args) {
        iPhone myPhone = new iPhone();
        myPhone.powerOn();
        myPhone.takePhoto();
        myPhone.browseInternet();
    }
}
