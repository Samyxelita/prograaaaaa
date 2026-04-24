public class ListaDeCompras {

    public static void main(String[] args) {
        String[] ingredientes = {"peperonni", "jamon", "queso", "tomate"};
        String [] amigos = {"Victor", "Roberto"};
        int[] numeros = {10, 20, 30};
        System.out.println("Ingrediente 2 :" + ingredientes[1]);

        System.out.println("El segundo numero es :" + numeros[1]);
        numeros[1] = 50;
        System.out.println("Ingrediente 2 :" + ingredientes[1]);
        System.out.println("Ahora El segundo numero es :" + numeros[1]);

      

        System.out.println("Tengo " + amigos.length + " amigos y se llaman: ");
        for (int i = 0; i < amigos.length; i++) {
           
            System.out.println(amigos[i]);

        }



        

    }
    
}
