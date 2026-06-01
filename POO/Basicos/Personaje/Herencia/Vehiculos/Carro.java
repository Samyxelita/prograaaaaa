package POO.Basicos.Personaje.Herencia.Vehiculos;

public class Carro extends Vehiculos {

    private int puertas;
    private boolean bolsaDeAire;

    public Carro(String marca, int precio, int anio, int cantidadDeRuedas, int puertas) {
        super(marca, precio, anio, cantidadDeRuedas);
        this.puertas = puertas;
        this.bolsaDeAire = true;
    }

}
