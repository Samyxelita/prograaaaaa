package DragonPOO;

public class Juego {

    private Heroe heroe;
    private Dragon dragon;
    private Menu menu;

    public Juego() {
        heroe = new Heroe("Gladiador", 100);
        dragon = new Dragon("Shenlong", 150);
        menu = new Menu();
    }

    public void jugar() {

        while (!this.hayGanador()) {

            menu.mostrarOpciones();
            switch (menu.opcionElegida()) {
                case 1 -> heroe.ataquePrincipal(dragon);
                case 2 -> heroe.curar();
                case 3 -> heroe.descansar();
            }
            if (dragon.estaVivo()) {

                dragon.ataquePrincipal(heroe);

                if (!heroe.estaVivo()) {
                    dragon.celebra(heroe);
                } else {
                    this.mostrarResumen();
                }

            } else {
                heroe.celebra(dragon);
            }

        }
    }

    private void mostrarResumen() {
        System.out.println("HEROE: " + heroe.getVida() + " DRAGON: " + dragon.getVida() + " Estamina disponible "
                + heroe.getEstamina());
    }

    private boolean hayGanador() {

        return !dragon.estaVivo() || !heroe.estaVivo();

    }

}
