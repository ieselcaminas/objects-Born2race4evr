package herencia.network;

import java.util.Date;

public class Publi {
    private Usuario usuario;
    private Date fecha;
    private int likes;

    public Publi(Usuario usuario) {
        this.usuario = usuario;
        this.fecha = new Date();
        this.likes = 0;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void getLikes(int likes) {
        this.likes = likes;
    }

    public int Like() {
        this.likes = likes++;
        return this.likes;
    }

    public int Dislike() {
        this.likes = likes--;
        return this.likes;
    }



}
