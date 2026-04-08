import java.util.Random;
import java.util.Scanner;


public class Aleatorio2 {
    public static void main (String[] args) {
        Random generador = new Random();
        Scanner lector = new Scanner(System.in);


        int numeroSecreto = generador.nextInt(10) + 1;

        System.out.println("Adivina el numero del 1 al 10 " );
        int intentoUsuario = lector.nextInt();

        if (intentoUsuario == numeroSecreto) {
        
            System.out.println("Felicidades, descubriste el numero!" );

        }
        else {
            System.out.println("El numero era " + numeroSecreto + " Buen intento!");


        }
    }
}