package herencia.network;

public class Foto extends Publi{
    private String Titulo;
    private String Archivo;

    public Foto(Usuario usuario, String Titulo, String Archivo) {
        super(usuario);
        this.Titulo = Titulo;
        this.Archivo = Archivo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getArchivo() {
        return Archivo;
    }

    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }

    @Override
    public String toString() {
        return "Foto{" + "Titulo=" + Titulo + ", Archivo=" + Archivo + '}';
    }

}
