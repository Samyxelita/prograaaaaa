package Proyectos.Ejercicios;

public class Maximo {

    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5, 6, 11, 0 };
        int max = numeros[0];
        int min = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("Numero mas grande del array: " + max);
        System.out.println("Numero mas pequeno del array: " + min);

    }

}
