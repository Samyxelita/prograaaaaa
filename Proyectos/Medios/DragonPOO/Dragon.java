package DragonPOO;

public class Dragon {

    private int vida;
    private String nombre;

    public Dragon(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void contraAtaque(Heroe heroe) {
        heroe.recibirDano(10);
    }

    public void celebra(Heroe heroe) {
        System.out.println("Soy el dragon " + nombre + "y mate a " + heroe.getNombre());
    }

    public void recibirDano(int danoRecibido) {
        this.vida = Math.max(0, this.vida - danoRecibido);
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

}
