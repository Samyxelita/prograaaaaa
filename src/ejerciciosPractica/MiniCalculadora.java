import java.util.Scanner;

public class MiniCalculadora {
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1;
        int num2;
        int resultado = 0;

        System.out.println("Primer numero: ");
        num1 = lector.nextInt();

         System.out.println("Segundo numero: ");
        num2 = lector.nextInt();

        lector.nextLine();

        System.out.println("Elige una operacion : + - * /");
        String operacion = lector.nextLine();

       if (operacion.equals("+")) {
            resultado = num1 + num2;
        } else if (operacion.equals("-")) {
            resultado = num1 - num2;
        } else if (operacion.equals("*")) {
            resultado = num1 * num2;
        } else if (operacion.equals("/")) {
            resultado = num1 / num2;
        }

        
        System.out.println("El resultado es " + resultado);

    }
}