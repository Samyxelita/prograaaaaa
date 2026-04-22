import java.util.Random;
import java.util.Scanner;

public class DragonV02 {
    public static void main(String[] args) {
         Random generador = new Random();
        Scanner lector = new Scanner(System.in);
        
        int vidaHeroe = 100;
        int vidaDragon = 100;
        int opcion;
        int estamina = 50; 
        boolean combateActivo = vidaHeroe > 0 && vidaDragon > 0;



        while (combateActivo){
            int dañoHeroe = generador.nextInt(16) + 15;
            int dañoDragon = generador.nextInt(16) + 15;
            System.out.println("Elige que deseas hacer 1.Atacar 2.Curarte ");
            opcion = lector.nextInt();

            switch (opcion) {

                case 1 -> {

                    if (estamina >= 10){
                        estamina -= 10;
                        vidaDragon -= dañoHeroe;
                        System.out.println("Has hecho " + dañoHeroe + " de daño y tu estamina restante es " + estamina);
                    }

                }

                case 2 -> {
                    if (estamina >= 15) {
                        estamina -= 15;
                        vidaHeroe += 10;

                        System.out.println("Te has curado, ahora tienes : " + vidaHeroe +" de vida");
                    }
                }

                default  -> {
                    System.out.println("Esa opción no existe, ¡espabila!");
                }

            }

            System.out.println("Vida dragon: " + vidaDragon + "|| Vida Heroe " + vidaHeroe);



            if (vidaDragon > 0) {
                vidaHeroe -= dañoDragon; 
                System.out.println("El dragon te ha hecho " + dañoDragon + " de daño");
            }
            
            else {
                combateActivo = false;
                System.out.println("Dragon muerto!!!!");

            }

            if (vidaHeroe < 0) {
                combateActivo = false;
                System.out.println("Moriste tu!!!!");

            }    

            estamina += 5;
            if (estamina >= 50) {
                estamina = 50;
            }
            

        }
    }
}
