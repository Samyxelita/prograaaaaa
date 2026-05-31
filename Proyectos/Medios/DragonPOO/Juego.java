package DragonPOO;

public class Juego {

    private Heroe heroe;
    private Dragon dragon;
    private Menu menu;

    public Juego() {
        heroe = new Heroe("Gladiador");
        dragon = new Dragon("Shenlong");
        menu = new Menu();
    }

    public void jugar() {

        while (!this.hayGanador()) {

            menu.mostrarOpciones();
            switch (menu.opcionElegida()) {
                case 1 -> heroe.atacar(dragon);
                case 2 -> heroe.curar();
            }

            if (dragon.estaVivo()) {
                dragon.contraAtaque(heroe);
            } else {
                heroe.celebra();
            }

            if (!heroe.estaVivo()) {
                dragon.celebra();
            }

        }

    }

    private boolean hayGanador() {

        return dragon.estaVivo() && heroe.estaVivo();

    }

}
