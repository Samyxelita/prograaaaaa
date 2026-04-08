import java.util.Random;

public class Aleatorio {
    public static void main(String[] args){
        Random generador = new Random();

        int numeroAleatorio =  generador.nextInt(6) + 1;

        System.out.println("Haz lanzado el dado y tiene un valor de: " +numeroAleatorio);


    }
    
}
