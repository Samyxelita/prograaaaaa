package DragonPOO;

public class Heroe {
    private int vida = 100;
    private int estamina = 50;
    private String nombre;

    public Heroe(String nombre) {
        this.nombre = nombre;
    }

    public void atacar(Dragon dragon) {
        if (hayEstamina(10)) {
            dragon.setVida(-10);
        }
        recuperarEstamina(5);
    }

    public void descansar() {
        recuperarEstamina(15);
    }

    public void curar() {
        if (hayEstamina(15)) {
            this.vida += 20;
        }
        recuperarEstamina(5);
    }

    public void celebra() {
        System.out.println("Soy el heroe " + nombre + " y he ganado!!!");
    }

    public boolean estaVivo() {
        return vida <= 0;
    }

    private boolean hayEstamina(int estamina) {
        if (estamina > this.estamina) {
            return true;
        } else {
            System.out.println("Sin estamina disponible");
            return false;
        }

    }

    private void recuperarEstamina(int estamina) {
        this.estamina += estamina;
    }

}
