package herencia.network;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Publi> publis = new ArrayList<>();

        Usuario Jose = new Usuario("Oso_Maduro", "Jose Manuel", "1");
        Mensaje m = new Mensaje(Jose, 1, "Soy bobo");
        publis.add(m);

        Usuario Mariela = new Usuario("Viciosa123", "Mariela Bacab", "1");
        Foto f = new Foto(Mariela, "Noche de diversión", "C:/nocturna.png");
        publis.add(f);

        f.Like();
        System.out.println(m);

        System.out.println(f);
    }
}
