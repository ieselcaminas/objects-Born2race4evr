package herencia.ej7;

import herencia.uni.Departamento;
import herencia.uni.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private String nombre;
    private int cod_t;
    private List<Libro> libros;


    public Tema(String nombre, int cod_t) {
        this.nombre = nombre;
        this.cod_t = cod_t;
        this.libros = new ArrayList<>();
    }

    public String getNombre(String nombre) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_t(int cod_t) {
        return cod_t;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void addLibros(Libro libro) {
        this.libros.add(libro);
    }
    @Override
    public String toString() {
        return this.nombre + " " + this.cod_t;
    }
}
