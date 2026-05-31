package POO.Basicos.Personaje;

public class Personaje {
    private String nombre;
    private int nivel;
    private int vida;

    public Personaje(String nombre) {
        vida = 1;
        nivel = 1;
        this.nombre = nombre;

    }

    public void subirNivel() {
        nivel++;
        System.out.println("¡" + nombre + " ha subido al nivel " + nivel);

    }

    public void atacar(Personaje enemigo) {
        enemigo.vida -= 10;
        System.out.println(this.nombre + " a atacado a " + enemigo.nombre);
    }

    public void mostrarVida() {
        System.out.println("Vida restante de " + nombre + ": " + vida);
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else {
            this.vida = vida;
        }
    }

    public void curar(int puntosCuracion) {
        this.vida = Math.min(100, this.vida + puntosCuracion);

        if (vida > 100) {
            vida = 100;
        }
    }

}
