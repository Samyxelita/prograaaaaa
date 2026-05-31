package DragonPOO;

public class Heroe {
    private int vida;
    private int estamina = 50;
    private String nombre;

    public Heroe(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
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

    public void celebra(Dragon dragon) {
        System.out.println("Soy el heroe " + nombre + " y he matado a " + dragon.getNombre());
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    private boolean hayEstamina(int estamina) {
        if (this.estamina > estamina) {
            this.estamina -= estamina;
            return true;
        } else {
            System.out.println("Sin estamina disponible");
            return false;
        }

    }

    private void recuperarEstamina(int estamina) {
        this.estamina += estamina;
    }

    public void setVida(int vida) {
        if (this.vida < 0) {
            this.vida = 0;
        } else {
            this.vida += vida;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getEstamina() {
        return estamina;
    }

}
