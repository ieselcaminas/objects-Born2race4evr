package herencia.ej3;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Pepe");
        Cuenta c2 = new Cuenta("Jacinto", 1000);
        c2.ingresar(100);
        c2.retirar(200);
        System.out.println(c2.getCantidad());

    }
}
