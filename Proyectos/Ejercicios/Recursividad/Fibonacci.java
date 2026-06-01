package Proyectos.Ejercicios.Recursividad;

public class Fibonacci {

    public static int fibonacci(int n) {
        // Caso Base
        if (n <= 1) {
            return n;
        }
        // Múltiples llamadas recursivas en el mismo caso
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
