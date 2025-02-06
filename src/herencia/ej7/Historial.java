package herencia.ej7;

import herencia.uni.Area_Conocimiento;
import herencia.uni.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private String data_p;
    private String data_t;
    private List<Ejemplar> ejemplares;


    public Historial(String data_p,String data_t) {
        this.data_p = data_p;
        this.data_t = data_t;
        this.ejemplares = new ArrayList<>();
    }

    public String getData_p() {
        return data_p;
    }

    public String getData_t() {
        return data_t;
    }

    public List<Ejemplar> getEjemplar() {
        return ejemplares;
    }

    public void addEjemplares(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString() {
        return this.data_p + " " + this.data_t;
    }
}
