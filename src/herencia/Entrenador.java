package herencia;
public class Entrenador extends Mamifero{

    Entrenador(String texto){
        super(texto);
    }
    @Override
    public void comunicarse() {
        System.out.println("Me comunico hablando");
    }

    public void entrenar(Jugar animalQueSabeJugar){
        animalQueSabeJugar.saltarPorUnAro();
    }

    public void dejarEntrar(Animal animal){
        if (animal instanceof Jugar)
            System.out.println("Te dejo pasar");
        else
            System.out.println("NO te dejo pasar");
    }

}
