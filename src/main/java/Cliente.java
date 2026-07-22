public class Cliente implements Observer {

    @Override

    public void actualizar(String mensaje) {

        System.out.println("Cliente: " + mensaje);

    }
}
