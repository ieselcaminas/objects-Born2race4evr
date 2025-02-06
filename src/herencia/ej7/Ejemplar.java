package herencia.ej7;

import herencia.uni.Area_Conocimiento;
import herencia.uni.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Ejemplar {
    private String nombre;
    private int n_reg;
    private Libro libro;
    private Historial historial;

    public Ejemplar(String nombre,int n_reg, Libro libro, Historial historial) {
        this.nombre = nombre;
        this.n_reg = n_reg;
        this.libro = libro;
        this.historial = historial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_reg() {
        return n_reg;
    }

    public Libro getLibro() {
        return libro;
    }

    public Historial getHistorial() {
        return historial;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.n_reg;
    }
}
