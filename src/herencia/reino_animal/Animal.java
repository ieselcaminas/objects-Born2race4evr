package herencia.reino_animal;
/**
 * Esta clase da cierta funcionalidad para un Animal que tiene un nombre y sabe hacer ciertas cosas!
 */
public abstract class Animal
{
    private String nombre;

    /**
     * Constructor para objetos de la clase Animal
     */
    public Animal(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        nombre = nombre;
    }

    /**
     * El método comunicarse es común para todos los animales pero cada uno lo hace a su manera
     *
     */
    public abstract void comunicarse();

    /**
     * El método respirar es común para todos los animales pero cada uno lo hace a su manera
     *
     */
    public abstract void respirar();


    /**
     * El método moverse es común para el gato y el perro
     *
     */
    public abstract void moverse();
    /**
     *
     * toString() Representación como cadena de un objeto animal
     *
     * @returns  La representación como cadena de un objeto animal
     *
     */
    @Override
    public String toString()
    {
        return "Animal: " + nombre;
    }
}
