package herencia.uni;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private int c_cat;
    private String nombre;
    private List<Departamento> departamentos;
    private List<Profesor> profesores;
    private Facultad facultad;

    public Catedra(int c_cat, String nombre, Facultad facultad) {
        this.c_cat = c_cat;
        this.nombre = nombre;
        this.facultad = facultad;
        this.departamentos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public int getC_cat() {
        return c_cat;
    }

    public void setC_cat(int c_cat) {
        this.c_cat = c_cat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }
    public List<Profesor> getProfesores() {
        return profesores;
    }
    public void addProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }


}