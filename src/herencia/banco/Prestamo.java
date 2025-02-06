package herencia.banco;

public class Prestamo {
    private int num_p;
    private double cantidad;
    private Cliente cliente;
    private Sucursal sucursal;

    public Prestamo(int num_p, double cantidad, Cliente cliente, Sucursal sucursal) {
        this.num_p = num_p;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.sucursal = sucursal;
    }

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Sucursal getSucursal() {
        return sucursal;
    }

    @Override
    public String toString() {
        return this.num_p + " - " + this.cantidad + " - " + this.cliente + " - " + this.sucursal;
    }

}
