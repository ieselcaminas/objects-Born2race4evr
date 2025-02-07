package herencia.ej7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear editoriales
        Editorial editorial1 = new Editorial("Anagrama", 1);
        Editorial editorial2 = new Editorial("Planeta", 2);

        // Crear temas
        Tema tema1 = new Tema("Novela", 1);
        Tema tema2 = new Tema("ciencia ficcion", 2);

        // Crear autores
        Autor autor1 = new Autor("Gabriel García Márquez", 1);
        Autor autor2 = new Autor("Isaac Asimov", 2);

        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", 1234, tema1, editorial1);
        Libro libro2 = new Libro("Fundación", 5678, tema2, editorial2);

        // Establecer relaciones bidireccionales entre libros y autores
        libro1.addAutores(autor1);
        autor1.addLibros(libro1);
        libro2.addAutores(autor2);
        autor2.addLibros(libro2);

        // Establecer relaciones bidireccionales entre libros y editoriales
        editorial1.addLibros(libro1);
        editorial2.addLibros(libro2);

        // Establecer relaciones bidireccionales entre libros y temas
        tema1.addLibros(libro1);
        tema2.addLibros(libro2);

        // Crear históricos con fechas
        Date fechaPrestamo1 = new Date(); // Fecha actual
        Date fechaDevolucion1 = new Date(System.currentTimeMillis() + 15 * 24 * 60 * 60 * 1000L); // 15 días después
        Historial historial1 = new Historial(fechaPrestamo1, fechaDevolucion1);

        // Crear ejemplares
        Ejemplar ejemplar1 = new Ejemplar("limon",1, libro1, historial1);
        Ejemplar ejemplar2 = new Ejemplar("polo tropical", 2, libro1, historial1);
        Ejemplar ejemplar3 = new Ejemplar("amargo", 3, libro2, historial1);

        // Establecer relaciones bidireccionales entre ejemplares y libros
        libro1.addEjemplares(ejemplar1);
        libro1.addEjemplares(ejemplar2);
        libro2.addEjemplares(ejemplar3);

        // Crear lectores
        Lector lector1 = new Lector(12345678, "pepe", historial1);
        Lector lector2 = new Lector(87654321, "jacinta", historial1);

        // Establecer relaciones con el histórico
        historial1.addEjemplares(ejemplar1);
        historial1.addLectores(lector1);
        historial1.addLectores(lector2);

        // Mostrar información
        System.out.println("\n=== Información de la Biblioteca ===");

        System.out.println("\nLibros por Editorial:");
        System.out.println(editorial1.getNombre() + ":");
        for (Libro libro : editorial1.getLibros()) {
            System.out.println("- " + libro.getTitulo());
        }

        System.out.println("\nAutores y sus libros:");
        for (Autor autor : new Autor[]{autor1, autor2}) {
            System.out.println(autor.getNombre() + ":");
            for (Libro libro : autor.getLibros()) {
                System.out.println("- " + libro.getTitulo());
            }
        }

        System.out.println("\nEjemplares por libro:");
        for (Libro libro : new Libro[]{libro1, libro2}) {
            System.out.println(libro.getTitulo() + ":");
            for (Ejemplar ejemplar : libro.getEjemplares()) {
                System.out.println("- Registro #" + ejemplar.getN_reg());
            }
        }

        System.out.println("\nLectores actuales:");
        for (Lector lector : historial1.getLector()) {
            System.out.println("- " + lector.getNombre() + " (DNI: " + lector.getDni() + ")");
        }
    }
}
