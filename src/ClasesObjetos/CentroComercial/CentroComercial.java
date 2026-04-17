package ClasesObjetos.CentroComercial;

public class CentroComercial {

    private Cola cola;
    private Caja[] cajas;
    private Tiempo tiempo;
    private boolean llegaClienteEsteMinuto;
    private Console console;

    public void simular() {
        do {
            tiempo.avanzar();
            this.procesarLlegadaCliente();
            cola.registrarEstado();
            this.asignarClientesACajas();
            this.procesarAtencionCajas();
            this.mostrarEstado();
            this.pausar();
        } while (!tiempo.haFinalizado());

    }

    private void pausar() {
       
    }

    private void mostrarEstado() {
       
    }

    private void procesarAtencionCajas() {
       
    }

    private void asignarClientesACajas() {
       
    }

    private void procesarLlegadaCliente() {
       
    }

}
