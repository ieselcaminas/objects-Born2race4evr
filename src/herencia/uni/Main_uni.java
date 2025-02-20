package herencia.uni;

import java.util.ArrayList;
import java.util.List;


public class Main_uni {
    public static void main(String[] args) {
        Facultad universidad = new Facultad(1, "UPV");

        List<Area_Conocimiento> facultad = new ArrayList<>();

        Area_Conocimiento ciencia = new Area_Conocimiento(1, "Ciencias");
        Catedra catCiencias = new Catedra(1, "Cátedra Ciencias", universidad);
        universidad.addCatedra(catCiencias);
        Departamento inf = new Departamento(1, "Informática", ciencia, catCiencias);
        Profesor victor = new Profesor("Pepe", inf);
        inf.addProfesor(victor);
        victor.addCatedra(catCiencias);
        catCiencias.addProfesor(victor);

        Profesor ruben = new Profesor("Jacinto", inf);
        inf.addProfesor(ruben);
        ruben.addCatedra(catCiencias);
        catCiencias.addProfesor(ruben);

        Departamento mat = new Departamento(2, "Matemáticas", ciencia, catCiencias);
        Profesor prof = new Profesor( "Juan", mat);
        mat.addProfesor(prof);

        ciencia.addDepartamento(inf);
        ciencia.addDepartamento(mat);


        Catedra catLetras = new Catedra(2, "Cátedra letras", universidad);
        universidad.addCatedra(catLetras);
        Area_Conocimiento letras = new Area_Conocimiento(2, "Letras");
        Departamento latin = new Departamento(3, "Latín", letras, catLetras);
        letras.addDepartamento(latin);

        facultad.add(ciencia);
        facultad.add(letras);

        for (Area_Conocimiento area:facultad){
            for (Departamento dep: area.getDepartamentos()){
                System.out.println("\t" + dep.getNombre());
                System.out.println("\t\t" + dep.getCatedra().getNombre());
                for (Profesor p: dep.getCatedra().getProfesores()){
                    System.out.println("\t\t\t" + p.getNombre());
                }
            }
        }

    }
}