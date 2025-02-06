package herencia.banco;

import java.util.ArrayList;
import java.util.List;

public class Main_banco {
    public static void main(String[] args) {
        List<Banco> bancos = new ArrayList<>();
        Banco BBVA = new Banco(1, "BBVA");
        bancos.add(BBVA);
            Sucursal sucursalBBVA = new Sucursal(1, "sucursalBBVA", BBVA);
            BBVA.addSucursal(sucursalBBVA);
                Cliente julio = new Cliente("121212", "julio");
                Prestamo pjulio = new Prestamo(1, 100, julio, sucursalBBVA);
                    julio.addPrestamo(pjulio);
                sucursalBBVA.addPrestamo(pjulio);

        BBVA.getSucursales().stream().forEach(System.out::println);

    }
}
