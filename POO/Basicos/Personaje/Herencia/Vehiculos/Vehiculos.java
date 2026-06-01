package POO.Basicos.Personaje.Herencia.Vehiculos;

public class Vehiculos {
    protected String marca;
    protected int precio;
    protected int anio;
    protected int cantidadDeRuedas;

    public Vehiculos(String marca, int precio, int anio, int cantidadDeRuedas) {
        this.marca = marca;
        this.precio = precio;
        this.anio = anio;
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public void mostrarInformacion() {
        System.out.println("Soy un vehiiculo de la marca " + marca + " cuesto " + precio + " y soy modelo " + anio);
    }

}
