package Proyectos.Ejercicios;

public class SumarDigitos {

    public static void main(String[] args) {
        int num = 347;

        System.out.println(sumar(num));

    }

    public static int sumar(int num) {

        int resultado;
        if (num < 10) {
            resultado = num;
        } else {
            int ultimoDigito = (num % 10);
            int resto = (num / 10);
            resultado = ultimoDigito + sumar(resto);
        }

        return resultado;

    }

}