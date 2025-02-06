package herencia.banco;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int n_suc;
    private String nombre;
    private Banco banco;
    private List<Prestamo> prestamos;

    public Sucursal(int n_suc, String nombre, Banco banco) {
        this.n_suc = n_suc;
        this.banco = banco;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }


    @Override
    public String toString() {
        return this.n_suc + " - " + this.nombre;
    }

}
