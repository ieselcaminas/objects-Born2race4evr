package herencia.casa_subastas;

import java.util.ArrayList;
import java.util.List;

public class Pujador {
    private int n_puj;
    private String nombre;
    private List<Puja> pujas = new ArrayList<>();

    public Pujador(int n_puj, String nombre) {
        this.n_puj = n_puj;
        this.nombre = nombre;
    }

    public int getN_puj() {
        return n_puj;
    }

    public void setN_puj(int n_puj) {
        this.n_puj = n_puj;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }

    @Override
    public String toString(){
        return this.n_puj + " - " + this.nombre;
    }
}