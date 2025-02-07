package herencia.ej7;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private int cod_aut;
    private List<Libro> libros;


    public Autor(String nombre, int cod_aut) {
        this.nombre = nombre;
        this.cod_aut = cod_aut;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_aut(int cod_aut) {
        return cod_aut;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void addLibros(Libro libro) {
        this.libros.add(libro);
    }
    @Override
    public String toString() {
        return this.nombre + " " + this.cod_aut;
    }
}
