package herencia.uni;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private Area_Conocimiento area;
    private List<Profesor> profesores;

    public Departamento(String nombre, Area_Conocimiento area) {
        this.nombre = nombre;
        this.area = area;
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Area_Conocimiento getArea() {
        return area;
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
