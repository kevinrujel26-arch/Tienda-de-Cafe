import java.util.ArrayList;
import java.util.List;

public class Pedido implements Subject {
    private String estado;

    private List<Observer> observadores;


    public Pedido() {
        observadores = new ArrayList<>();
    }


    @Override
    public void agregarObservador(Observer observer) {
        observadores.add(observer);
    }


    @Override
    public void eliminarObservador(Observer observer) {
        observadores.remove(observer);
    }


    @Override
    public void notificarObservadores() {

        for (Observer observer : observadores) {
            observer.actualizar(estado);
        }

    }


    public void cambiarEstado(String nuevoEstado) {

        estado = nuevoEstado;

        System.out.println("\nEstado del pedido: " + estado);

        notificarObservadores();

    }

}