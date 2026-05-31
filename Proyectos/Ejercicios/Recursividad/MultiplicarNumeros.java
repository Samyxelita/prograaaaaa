package Proyectos.Ejercicios.Recursividad;

public class MultiplicarNumeros {

    public static void main(String[] args) {
        System.out.println(multiplicar(5, 3));

    }

    public static int multiplicar(int a, int b) {
        int resultado = 0;

        if (b == 0) {
            resultado = 0; // caso base
        }

        else {
            resultado = a + multiplicar(a, (b - 1));
        }

        return resultado;

    }

}
