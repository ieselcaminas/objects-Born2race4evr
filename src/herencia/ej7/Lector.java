package herencia.ej7;

import herencia.uni.Area_Conocimiento;
import herencia.uni.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String dni;
    private Historial historial;

    public Lector(String dni, Historial historial) {
        this.dni = dni;
        this.historial = historial;
    }

    public String getDni() {
        return dni;
    }

    public Historial getHistorial() {
        return historial;
    }

    @Override
    public String toString() {
        return this.dni;
    }
}
