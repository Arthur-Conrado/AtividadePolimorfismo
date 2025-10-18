import moto.Moto;
public class App {
    public static void main(String[] args) {
        Moto moto= new Moto("Harley Davidson", 300.0, "Preta", "Metal", 50000.0);
        moto.acelerar();
        moto.cor();
        moto.peso();
    }
}
