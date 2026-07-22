
public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        Cocina cocina = new Cocina();
        Cliente cliente = new Cliente();
        Caja caja = new Caja();


        pedido.agregarObservador(cocina);
        pedido.agregarObservador(cliente);
        pedido.agregarObservador(caja);


        pedido.cambiarEstado("Preparando cafe");

        pedido.cambiarEstado("Pedido entregado");


    }
}