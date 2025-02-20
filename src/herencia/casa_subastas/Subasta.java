package herencia.casa_subastas;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private int n_sub;
    private String nombre;
    private List<Lote> lotes = new ArrayList<>();

    //*******

    public Subasta(int n_sub, String nombre) {
        this.n_sub = n_sub;
        this.nombre = nombre;
    }

    public int getN_sub() {
        return n_sub;
    }

    public void setN_sub(int n_sub) {
        this.n_sub = n_sub;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void addLote(Lote lote){
        this.lotes.add(lote);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
