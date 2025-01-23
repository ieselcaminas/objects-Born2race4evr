package herencia.reino_animal;

public class Ornitorrinco extends Mamifero implements PonerHuevos {

    Ornitorrinco(String nombre){
        super(nombre);
    }
    @Override
    public void comunicarse()
    {

        System.out.println("Se comunica con burbujas");

    }

    @Override
    public void ponerHuevos(){
        System.out.println("Pongo huevos");
    }
}
