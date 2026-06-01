package DragonPOO;

import java.util.Random;

public class Heroe extends Personaje {

    private int estamina;

    public Heroe(String nombre, int vida) {
        super(nombre, vida);
        this.estamina = 50;
    }

    public void ataquePrincipal(Personaje personaje) {
        if (hayEstamina(10)) {
            Random random = new Random();
            int dano = random.nextInt(16) + 10;
            personaje.recibirDano(dano);
        }
        recuperarEstamina(5);
    }

    public void descansar() {
        recuperarEstamina(15);
    }

    public void curar() {
        if (hayEstamina(15)) {
            this.vida = Math.min(100, this.vida + 20);
        }
        recuperarEstamina(5);
    }

    public int getEstamina() {
        return estamina;
    }

    private void recuperarEstamina(int estamina) {
        this.estamina = Math.min(50, this.estamina + estamina);
    }

    private boolean hayEstamina(int estamina) {
        if (this.estamina >= estamina) {
            this.estamina -= estamina;
            return true;
        } else {
            System.out.println("Sin estamina disponible");
            return false;
        }

    }

}
