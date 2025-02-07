package herencia.ej7;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private String nombre;
    private int cod_ed;
    private List<Libro> libros;


    public Editorial(String nombre, int cod_ed) {
        this.nombre = nombre;
        this.cod_ed = cod_ed;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_ed(int cod_ed) {
        return cod_ed;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void addLibros(Libro libro) {
        this.libros.add(libro);
    }
    @Override
    public String toString() {
        return this.nombre + " " + this.cod_ed;
    }
}
