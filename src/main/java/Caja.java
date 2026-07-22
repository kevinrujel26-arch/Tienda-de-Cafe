public class Caja implements Observer {

    @Override

    public void actualizar(String mensaje) {

        System.out.println("Caja: " + mensaje);

    }
}
