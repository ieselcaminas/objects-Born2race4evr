package herencia.casa_subastas;

public class Puja {
    private int n_puj;
    private double cantidad;
    private Pujador pujador;
    private Lote lote;

    public Puja(int n_puj, double cantidad, Pujador pujador, Lote lote) {
        this.n_puj = n_puj;
        this.cantidad = cantidad;
        this.pujador = pujador;
        this.lote = lote;
    }

    public int getN_puj() {
        return n_puj;
    }

    public void setN_puj(int n_puj) {
        this.n_puj = n_puj;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString(){
        return this.n_puj + " - " + this.cantidad;
    }
}

