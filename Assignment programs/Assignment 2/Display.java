package core_java;
interface Mobile {
    String NAME = "IQ NEO 10";
    void Name();
}
interface Laptop {
    String name = "Victus HP";
    void name();
}
class Devices implements Mobile, Laptop {
void tab() {
        System.out.println("I use tab");
    }
public void Name() {
        System.out.println("Mobile: " + Mobile.NAME);
    }
public void name() {
        System.out.println("Laptop: " + Laptop.name);
    }
}
public class Display {
    public static void main(String[] args) {
      Devices d = new Devices();
      d.tab();
      d.Name();
      d.name();
    }
}
