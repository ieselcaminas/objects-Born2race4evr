package herencia.network;

public class Usuario {
    private String nick;
    private String nombre;
    private String id;

    public Usuario(String nick, String nombre, String id) {
        this.nick = nick;
        this.nombre = nombre;
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nick=" + nick + ", nombre=" + nombre + ", id=" + id + '}';
    }

}
