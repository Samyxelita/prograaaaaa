package Proyectos.Ejercicios.Recursividad;

public class Factorial {

    public static void main(String[] args) {
        int num = 5;

        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        int resultado = 0;
        if (num == 0) {
            resultado = 1;
        } else {
            resultado = num * factorial(num - 1);
        }

        return resultado;
    }
}
