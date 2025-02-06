package herencia.uni;

import herencia.banco.Sucursal;

import java.util.ArrayList;
import java.util.List;

public class Area_Conocimiento {
    private String nombre;
    private List<Departamento> departamentos;

    public Area_Conocimiento(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre(String nombre) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    @Override
    public String toString() {
        return this.nombre;
    }


}
