package herencia.casa_subastas;

import herencia.ej7.Libro;

public class Articulo {
    private String nombre;
    private int precio;
    private int id;
    private Lote lote;

    public Articulo(String nombre, int precio, int id, Lote lote) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.lote = lote;
    }
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public Lote getLote() {
        return lote;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.precio + " " + this.id;
    }


}
