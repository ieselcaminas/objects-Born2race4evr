package herencia.ej7;

import herencia.uni.Area_Conocimiento;
import herencia.uni.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private int ISBN;
    private Tema tema;
    private Editorial editorial;
    private List<Autor> autores;
    private List<Ejemplar> ejemplares;

    public Libro(String titulo, int ISBN, Tema tema, Editorial editorial) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.tema = tema;
        this.editorial = editorial;
        this.autores = new ArrayList<>();
        this.ejemplares = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getISBN() {
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

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void addEjemplares(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString() {
        return this.titulo + " " + this.ISBN;
    }
}
