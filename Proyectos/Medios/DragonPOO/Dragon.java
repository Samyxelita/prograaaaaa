package DragonPOO;

public class Dragon extends Personaje {

    public Dragon(String nombre, int vida) {
        super(nombre, vida);
    }

    public void contraAtaque(Heroe heroe) {
        heroe.recibirDano(10);
    }

}
