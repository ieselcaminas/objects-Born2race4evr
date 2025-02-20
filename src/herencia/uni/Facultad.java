package herencia.uni;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private int n_fac;
    private String nombre;
    private List<Catedra> catedras;

    public Facultad(int n_fac, String nombre) {
        this.n_fac = n_fac;
        this.nombre = nombre;
        this.catedras = new ArrayList<>();
    }

    public int getN_fac() {
        return n_fac;
    }

    public void setN_fac(int n_fac) {
        this.n_fac = n_fac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }
}