package DragonPOO;

import java.util.Random;

public class Dragon extends Personaje {

    public Dragon(String nombre, int vida) {
        super(nombre, vida);
    }

    public void ataquePrincipal(Personaje personaje) {
        Random random = new Random();
        int danoBase = random.nextInt(11) + 10;
        if (this.vida < 45) {
            System.out.println(
                    "¡El dragon " + this.nombre + " entra en estado de Furia! Dano de contraataque duplicado.");
            danoBase *= 2;
        }
        personaje.recibirDano(danoBase);
    }

}
