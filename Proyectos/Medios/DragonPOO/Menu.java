package DragonPOO;

import java.util.Scanner;

public class Menu {

    Scanner lector = new Scanner(System.in);

    public void mostrarOpciones() {
        System.out.println("\n=== ACCIONES ===");
        System.out.println("1. Atacar");
        System.out.println("2. Curar");
        System.out.println("3. Descansar");
    }

    public int opcionElegida() {
        return lector.nextInt();
    }

}
