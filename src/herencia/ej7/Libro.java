package herencia.ej7;

import herencia.uni.Area_Conocimiento;
import herencia.uni.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String nombre;
    private String ISBN;
    private Tema tema;
    private Editorial editorial;
    private List<Autor> autores;

    public Libro(String nombre, String ISBN, Tema tema, Editorial editorial) {
        this.nombre = nombre;
        this.ISBN = ISBN;
        this.tema = tema;
        this.editorial = editorial;
        this.autores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public Tema getTema() {
        return tema;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void addAutores(Autor autor) {
        this.autores.add(autor);
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.ISBN;
    }
}
