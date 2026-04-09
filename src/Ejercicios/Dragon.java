import java.util.Random;
import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        Random generador = new Random();
        Scanner lector = new Scanner(System.in);

        int vidaDragon = 100;
        int vidaHeroe = 100;
        int pociones = 3;
        int opcion;
        int dañoHeroe = generador.nextInt(16) + 10;
        int dañoDragon = generador.nextInt(16) + 15;

        while (vidaDragon > 0 && vidaHeroe > 0) {
            System.out.println("Elige que deseas hacer 1.Atacar 2.Curarte ");
            opcion = lector.nextInt();
            vidaHeroe = vidaHeroe - dañoDragon;
            if (opcion == 1) {

                vidaDragon = vidaDragon - dañoHeroe;

                System.out.println("Vida restante del dragon:" + vidaDragon);
                System.out.println("Vida restante del heroe:" + vidaHeroe);

            } else if (opcion == 2) {
                if (pociones > 0) {
                    vidaHeroe = vidaHeroe + 20;
                    pociones = pociones - 1;
                    System.out.println("Curado! Vida restante: " + vidaHeroe);
                    System.out.println("Vida restante del dragon:" + vidaDragon);

                }

                else {
                    System.out.println("No tienes mas pociones ");

                }

            }
               System.out.println("HEROE : " + vidaHeroe + " Dragon: " + vidaDragon + "Pociones restantes " + pociones);


        }
        if (vidaDragon <= 0) {
            System.out.println("¡Has derrotado al dragón y salvado el reino!");

        } else if (vidaHeroe <= 0) {
            System.out.println("Has muerto... el reino arde en llamas.");
        }

    }

}
