package herencia.casa_subastas;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int n_lot;
    private String nombre;
    private List<Articulo> articulos = new ArrayList<>();
    private Subasta subasta;
    private List<Puja> pujas = new ArrayList<>();

    public Lote(int n_lot, String nombre, Subasta subasta) {
        this.n_lot = n_lot;
        this.nombre = nombre;
        this.subasta = subasta;
    }

    public int getN_lot() {
        return n_lot;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }
    @Override
    public String toString(){
        return this.n_lot + " - " + this.nombre;
    }
}