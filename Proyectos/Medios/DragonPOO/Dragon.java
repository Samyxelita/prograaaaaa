package DragonPOO;

public class Dragon {

    private int vida;
    private String nombre;

    public Dragon(String nombre) {
        this.nombre = nombre;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void contraAtaque(Heroe heroe) {
        heroe.setVida(-10);
    }

    public void celebra(Heroe heroe) {
        System.out.println("Soy el dragon " + nombre + "y mate a " + heroe.getNombre());
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else {
            this.vida += vida;
        }

    }

    public String getNombre() {
        return nombre;
    }

}
