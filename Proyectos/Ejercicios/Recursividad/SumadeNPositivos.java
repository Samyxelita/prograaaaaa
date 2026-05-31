package Proyectos.Ejercicios.Recursividad;

public class SumadeNPositivos {

    public static void main(String[] args) {
        System.out.println(sumar(5));
    }

    public static int sumar(int num) {

        if (num == 0) {
            return 0;
        }

        return num + sumar(num - 1);

    }
}
