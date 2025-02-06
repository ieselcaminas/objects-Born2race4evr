package herencia.uni;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private String nombre;
    private Facultad facultad;
    private Departamento departamento;
    private List<Profesor> profesores;

    public Catedra(String nombre, Facultad facultad, Departamento departamento) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.departamento = departamento;
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public List<Profesor> getProfesor() {
        return profesores;
    }

    public void addProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
