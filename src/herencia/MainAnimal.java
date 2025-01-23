package herencia;
public class MainAnimal {
    public static void main(String[] args) {
//        Animal animal = new Animal("Pedro");
//        System.out.println(animal.getNombre());
//        animal.comunicarse();

        Perro perro = new Perro("Pola");
        perro.comunicarse();
        perro.traerZapatillas();
        perro.mamar();

        Gato gato = new Gato("Gato");
        gato.comunicarse();
        gato.perseguirUnOvillo();
        gato.mamar();
        gato.respirar();

        Tiburon tiburon = new Tiburon("Tiburón");
        tiburon.comunicarse();
        tiburon.respirar();

        Entrenador pepe = new Entrenador("PEPE");

        pepe.entrenar(gato);
        pepe.entrenar(tiburon);

        pepe.dejarEntrar(perro);
        pepe.dejarEntrar(gato);

        perro.setNombre("Óscar");
        System.out.println(perro);

    }
}
