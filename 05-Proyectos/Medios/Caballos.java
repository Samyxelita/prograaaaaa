public class Caballos {
    public static void main(String[] args) {

        int caballos[] = { 0, 0, 0, 0 };
        int meta = 30;
        boolean carreraEnProgreso = true;
        int contadorGanadores = 0;
        String ganadores = "";

        while (carreraEnProgreso) {

            for (int i = 0; i < caballos.length; i++) {
                int avance = (int) (Math.random() * 4);
                caballos[i] += avance;
                
                if (caballos[i] >= meta) {
                    carreraEnProgreso = false;
                    contadorGanadores++;
                    ganadores += "Ganador " + (i + 1) + ", ";
                }

                int posicionActual = caballos[i];
                int bloquesRestantes = Math.max(0, meta - posicionActual);

                System.out.print("C" + (i + 1) + " | ");
                System.out.print("-".repeat(posicionActual));
                System.out.print("🐎");
                System.out.println("-".repeat(bloquesRestantes) + " | FIN");
            }

            

            System.out.println("".repeat(2));

        }

        if (contadorGanadores > 1 ) {
            System.out.println("Empate entre " + ganadores);
        }
        else {
            System.out.println("El unico gran ganador es : " + ganadores);
        }
    }
}