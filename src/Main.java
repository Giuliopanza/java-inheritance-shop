import org.shop.Cuffie;
import org.shop.Smartphone;
import org.shop.Televisori;

public class Main {
    public static void main(String[] args) {
        Smartphone S22ultra = new Smartphone("S22 Ultra", "Samsung", 1230f, 22, "MM23453781IS", 128);
        System.out.println(S22ultra.toString());
        Televisori Lg1233 = new Televisori("Lg123", "LG", 145f, 22, true, 55);
        System.out.println(Lg1233.toString());
        Cuffie Buds2 = new Cuffie("Galaxy Buds pro II", "Samsung", 100f, 22, true, "Bianco");
        System.out.println(Buds2.toString());
    }
}
