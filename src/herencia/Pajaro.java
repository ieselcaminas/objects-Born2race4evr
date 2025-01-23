package herencia;
public class Pajaro extends Animal implements PonerHuevos{

    Pajaro(String nombre){
        super(nombre);
    }
    @Override
    public void comunicarse(){
        System.out.println("Pío pío");
    }

    @Override
    public void respirar(){
        System.out.println("Respiro por pulmones");
    }

    @Override
    public void moverse(){
        System.out.println("Vuelo");
    }

    @Override
    public void ponerHuevos(){
        System.out.println("Pongo huevos");
    }

}
