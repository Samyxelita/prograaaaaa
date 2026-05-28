public class ForAnidados {
    public static void main(String[] args) {
        int numero = 3;
        int paso = 0;

        // Cabecera de la tabla
        System.out.printf("%-10s | %-8s | %-8s\n", "Vuelta", "Paso", "Numero");
        System.out.println("-----------------------------------");

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.printf("%-10d | %-8d | %-8d\n", i, paso, j);
                paso++;
            }
        }
    }
}
