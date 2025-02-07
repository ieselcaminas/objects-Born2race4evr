package herencia.ej7;

import herencia.uni.Area_Conocimiento;
import herencia.uni.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private int dni;
    private String nombre;
    private Historial historial;

    public Lector(int dni, String nombre, Historial historial) {
        this.dni = dni;
        this.nombre = nombre;
        this.historial = historial;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Historial getHistorial() {
        return historial;
    }

    @Override
    public String toString() {
        return "-" + this.dni;
    }
}
