package herencia.ej7;

import herencia.uni.Area_Conocimiento;
import herencia.uni.Profesor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Historial {
    private Date data_p;
    private Date data_t;
    private List<Ejemplar> ejemplares;
    private List<Lector> lectores;



    public Historial(Date data_p, Date data_t) {
        this.data_p = data_p;
        this.data_t = data_t;
        this.ejemplares = new ArrayList<>();
        this.lectores = new ArrayList<>();
    }

    public Date getData_p() {
        return data_p;
    }

    public Date getData_t() {
        return data_t;
    }

    public List<Ejemplar> getEjemplar() {
        return ejemplares;
    }

    public void addEjemplares(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    public List<Lector> getLector() {
        return lectores;
    }

    public void addLectores(Lector lector) {
        this.lectores.add(lector);
    }

    @Override
    public String toString() {
        return this.data_p + " " + this.data_t;
    }
}
