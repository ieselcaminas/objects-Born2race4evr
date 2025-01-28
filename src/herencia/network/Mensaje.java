package herencia.network;

public class Mensaje extends Publi{
    private int id;
    private String texto;

    public Mensaje(Usuario usuario, int id, String texto) {
        super(usuario);
        this.id = id;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.getUsuario() + " - " + this.getTexto();
    }
}
