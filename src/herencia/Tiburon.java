package herencia;
public class Tiburon extends Pez implements Jugar{
    public Tiburon(String nombre){
        super(nombre);
    }

    @Override
    public void comunicarse()
    {
        System.out.println("Me comunico con las aletas");
    }

    @Override
    public void saltarPorUnAro(){
        System.out.println("Sé saltar por aro");
    }

    @Override
    public void perseguirUnObjeto(){
        System.out.println("Sé perseguir una objeto");
    }
}
