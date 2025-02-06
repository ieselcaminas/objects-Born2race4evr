package herencia.banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String DNI;
    private String nombre;
    private List<Prestamo> prestamos;


    public Cliente(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return this.DNI + " - " + this.nombre;
    }


}
