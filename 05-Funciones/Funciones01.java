import java.util.Random;

public class Funciones01 {

    public static void main(String[] args) {
        int vidaEnemigo = 120;
        vidaEnemigo -= calcularDanoFinal(5, 15);

        System.out.print("La vida del enemigo es " + vidaEnemigo);

    }

    public static boolean calcularCritico() {

        Random random = new Random();
        int numero = random.nextInt(10 + 1);

        return numero > 8;
    }

    public static int calcularDanoFinal(int danoBase, int armadura) {
        int danoFinal = 0;
        if (calcularCritico()) {
            danoFinal = (danoBase * 2) - armadura;
        } else {
            danoFinal = danoBase - armadura;
        }

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        return danoFinal;

    }

}
