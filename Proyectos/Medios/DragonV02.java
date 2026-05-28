import java.util.Random;
import java.util.Scanner;

public class DragonV02 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int vidaHeroe = 100;
        int vidaDragon = 100;
        int opcion;
        int estamina = 50;
        int costeAtacar = 15;
        int costeDanar = 10;
        boolean combateActivo = vidaHeroe > 0 && vidaDragon > 0;

        while (combateActivo) {
            int dañoHeroe = generarDano();
            int dañoDragon = generarDano();
            mostrarMenu();
            opcion = lector.nextInt();

            switch (opcion) {

                case 1 -> {
                    if (verificarEstamina(estamina, 10)) {
                        vidaDragon = Atacar(vidaDragon, dañoHeroe);
                        estamina -= costeAtacar;
                    }
                }

                case 2 -> {
                    if (verificarEstamina(estamina, 15)) {
                        vidaHeroe = Curar(vidaHeroe);
                        estamina -= costeAtacar;
                    }
                }

                default -> {
                    System.out.println("Esa opción no existe, ¡espabila!");
                }

            }

            if (vidaDragon > 0) {
                vidaHeroe = contraAtaque(vidaHeroe, dañoDragon);
            }

            else {
                combateActivo = false;
                System.out.println("Dragon muerto!!!!");

            }

            if (vidaHeroe < 0) {
                combateActivo = false;
                System.out.println("Moriste tu!!!!");
            }

            resumenTurno(vidaDragon, vidaHeroe, dañoDragon, dañoHeroe, estamina);

            estamina = regenerarEstamina(estamina);

        }
    }

    private static boolean verificarEstamina(int estamina, int coste) {
        return estamina >= coste;
    }

    public static int regenerarEstamina(int estamina) {
        estamina += 5;
        if (estamina >= 50) {
            estamina = 50;
        }
        return estamina;

    }

    public static int generarDano() {
        Random generador = new Random();
        int dano = generador.nextInt(16) + 15;
        return dano;
    }

    public static void mostrarMenu() {
        System.out.println("\n=== ACCIONES ===");
        System.out.println("1. Atacar");
        System.out.println("2. Curar");
    }

    public static void resumenTurno(int vidaDragon, int vidaHeroe, int dañoDragon, int dañoHeroe, int estamina) {
        System.out.println("Estamina Restante: " + estamina);
        System.out.println("Dano del dragon: " + dañoDragon + "|| Dano del heroe: " + dañoHeroe);
        System.out.println("Vida dragon: " + vidaDragon + "|| Vida Heroe " + vidaHeroe);
    }

    public static int Curar(int vidaHeroe) {
        vidaHeroe += 10;
        System.out.println("Te has curado, ahora tienes : " + vidaHeroe + " de vida");
        return vidaHeroe;
    }

    public static int contraAtaque(int vidaHeroe, int dañoDragon) {
        return vidaHeroe - dañoDragon;

    }

    public static int Atacar(int vidaDragon, int dañoHeroe) {
        return vidaDragon -= dañoHeroe;
    }
}
