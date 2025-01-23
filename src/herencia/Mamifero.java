package herencia;
public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }
    /**
     * El método mamar es común para el gato y el perro
     *
     */
    public void mamar()
    {
        System.out.println("Cuando soy pequeño mamo");
    }
    /**
     * El método respirar es común para el gato y el perro
     *
     */
    @Override
    public void respirar()
    {
        System.out.println("Respiro aire por los pulmones");
    }

    @Override
    public void moverse(){
        System.out.println("Me muevo a 4 patas");
    }
}