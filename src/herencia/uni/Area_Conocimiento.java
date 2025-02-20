package herencia.uni;

import java.util.ArrayList;
import java.util.List;

public class Area_Conocimiento {
    private int n_area;
    private String nombre;
    private List<Departamento> departamentos;

    public Area_Conocimiento(int n_area, String nombre) {
        this.n_area = n_area;
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public int getN_area() {
        return n_area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    @Override
    public String toString() {
        return "Area " + this.nombre;
    }
}