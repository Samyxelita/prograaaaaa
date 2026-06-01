package DragonPOO;

public abstract class Personaje {
    protected int vida;
    protected String nombre;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public abstract void ataquePrincipal(Personaje personaje);

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDano(int danoRecibido) {
        this.vida = Math.max(0, this.vida - danoRecibido);
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void celebra(Personaje enemigo) {
        System.out.println("Soy el personaje " + nombre + " y he matado a " + enemigo.getNombre());
    }

}
