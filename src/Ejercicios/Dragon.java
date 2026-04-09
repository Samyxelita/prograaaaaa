import java.util.Random;
import java.util.Scanner;


public class Dragon {
    public static void main (String[] args){
        Random generador = new Random();
        Scanner lector = new Scanner(System.in);

        int vidaDragon = 100;
        int vidaHeroe = 100;
        int pociones = 3;
        int opcion;

          System.out.println("Elige que deseas hacer 1.Atacar 2.Curarte ");
        opcion = lector.nextInt();

       while (vidaDragon < 0  || vidaHeroe < 0 ) {
        if (opcion == 1 ){
            int daño = generador.nextInt(15) + 15;;

            vidaDragon = vidaDragon - daño;

            
        }
        if else (opcion == 2){
            if (pociones > 0 ) {
                vidaHeroe = vidaHeroe + 20;
                else {
                              System.out.println("No tienes mas pociones ");

                }
            }
            }
        }








    }
}